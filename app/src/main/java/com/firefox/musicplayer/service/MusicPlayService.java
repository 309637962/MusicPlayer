package com.firefox.musicplayer.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

import com.firefox.musicplayer.MainApplication;
import com.firefox.musicplayer.bean.Music;
import com.firefox.musicplayer.listener.OnLoadInformationListener;
import com.firefox.musicplayer.listener.OnProgressListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by FireFox on 2017/4/24.
 */

public class MusicPlayService extends Service implements MediaPlayer.OnCompletionListener {
    private OnProgressListener onProgressListener;
    private OnLoadInformationListener onLoadInformationListener;
    static MediaPlayer mediaPlayer;
    MyReceiver myReceiver = new MyReceiver();
    public static final int ORDER_PLAY = 0;//顺序播放
    public static final int RANDOM_PLAY = 1;//随机播放
    public static final int SINGLE_PLAY = 2;//单曲循环

    public int getPlayMode() {
        return playMode;
    }

    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }

    private int playMode = ORDER_PLAY;


    boolean flag_play = false;
    boolean flag_continue = false;

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);


        IntentFilter filter = new IntentFilter();
        filter.addAction("start");
        registerReceiver(myReceiver, filter);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    public boolean startOrPause() {
        if (flag_play) {
            mediaPlayer.pause();
            flag_play = false;
            flag_continue = true;
        } else if (flag_continue) {
            flag_continue = false;
            flag_play = true;
            mediaPlayer.start();
        }
        return flag_play;
    }

    public void startPlay(int index) {
        ArrayList<Music> playList = MainApplication.getPlayList();
        int currentIndex = MainApplication.getCurrentIndex();
        if (index >= 0 && index < playList.size()) {
            try {
                flag_play = true;
                flag_continue = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(playList.get(index).getMusicURL());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            currentIndex = (currentIndex + index) % playList.size();
            mediaPlayer.reset();
            startPlay(currentIndex);
        }
    }

    public void reset() {
        mediaPlayer.reset();
        setInformation();
    }

    public class PlayBinder extends Binder {

        public MusicPlayService getService() {
            return MusicPlayService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new PlayBinder();
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        int nextIndex = MainApplication.getNextIndex();
        if (nextIndex != -1) {
            startPlay(nextIndex);
            MainApplication.setNextIndex(-1);
            return;
        }
        ArrayList<Music> playList = MainApplication.getPlayList();
        int currentIndex = MainApplication.getCurrentIndex();
        switch (playMode) {
            case ORDER_PLAY://顺序播放
                startPlay(++currentIndex);
                break;
            case RANDOM_PLAY://随机播放
                startPlay(new Random().nextInt(playList.size()));
                break;
            case SINGLE_PLAY://单曲循环
                startPlay(currentIndex);
                break;
        }
    }

    private class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            ArrayList<Music> playList = MainApplication.getPlayList();
            int currentIndex = 0;
            try {
                if (intent.getAction().equals("start")) {
                    Music music = (Music) intent.getSerializableExtra("music");
                    if (playList.contains(music)) {
                        currentIndex = playList.indexOf(music);
                    } else {
                        playList.add(music);
                        currentIndex = playList.size() - 1;
                    }
                    startPlay(currentIndex);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onDestroy() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        unregisterReceiver(myReceiver);
    }

    public void setOnLoadInformationListener(OnLoadInformationListener onLoadInformationListener) {
        this.onLoadInformationListener = onLoadInformationListener;
    }


    public void setInformation() {
        int index = MainApplication.getCurrentIndex();
        if (onLoadInformationListener != null && index >= 0 && index < MainApplication.getPlayList().size()) {
            onLoadInformationListener.onLoadInformation(MainApplication.getPlayList().get(index), flag_play, flag_continue);
        } else if (onLoadInformationListener != null && MainApplication.getPlayList().size() == 0) {
            onLoadInformationListener.onLoadInformation(null, flag_play, flag_continue);
        }
    }


    //进度条监听器
    public void setOnProgressListener(OnProgressListener onProgressListener)
    {
        this.onProgressListener = onProgressListener;
    }

    public void setProgress()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    if (onProgressListener != null && flag_play == true)
                    {
                        handler.sendEmptyMessage(1);
                    }
                    try
                    {
                        Thread.sleep(100);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            if (msg.what == 1)
            {
                onProgressListener.onProgress(mediaPlayer.getCurrentPosition(), mediaPlayer.getDuration());
            }
        }
    };
}
