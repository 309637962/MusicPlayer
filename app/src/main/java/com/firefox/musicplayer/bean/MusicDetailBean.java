package com.firefox.musicplayer.bean;

import java.util.List;

/**
 * Created by FireFox on 2017/4/24.
 */

public class MusicDetailBean {

    /**
     * songs : [{"name":"Moon Without The Stars","id":28377211,"position":14,"alias":[],"status":0,"fee":0,"copyrightId":0,"disc":"2","no":15,"artists":[{"name":"Quiana","id":194643,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0},{"name":"Jerry Barnes","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}],"album":{"name":"古树旋律 Deemo","id":2774288,"type":"专辑","size":127,"picId":6046214441318535,"blurPicUrl":"http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","companyId":0,"pic":6046214441318535,"picUrl":"http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","publishTime":1384272000007,"description":"","tags":"","company":"雷亚游戏","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0},"songs":[],"alias":[],"status":3,"copyrightId":0,"commentThreadId":"R_AL_3_2774288","artists":[{"name":"群星","id":122455,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}],"subType":"录音室版"},"starred":false,"popularity":95,"score":95,"starredNum":0,"duration":213864,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_28377211","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":2,"rurl":null,"hMusic":null,"mMusic":{"name":"Moon Without The Stars","id":46689711,"size":4300608,"extension":"mp3","sr":44100,"dfsId":6037418348311743,"bitrate":160000,"playTime":213864,"volumeDelta":-2.65076E-4},"lMusic":{"name":"Moon Without The Stars","id":46689712,"size":2590737,"extension":"mp3","sr":44100,"dfsId":6027522743661760,"bitrate":96000,"playTime":213864,"volumeDelta":-2.65076E-4},"mvid":0,"bMusic":{"name":"Moon Without The Stars","id":46689712,"size":2590737,"extension":"mp3","sr":44100,"dfsId":6027522743661760,"bitrate":96000,"playTime":213864,"volumeDelta":-2.65076E-4},"mp3Url":"http://m2.music.126.net/t24d6GoZRkqxzFAovlZEQw==/6027522743661760.mp3","rtype":0}]
     * equalizers : {}
     * code : 200
     */

    private EqualizersBean equalizers;
    private int code;
    private List<SongsBean> songs;

    public EqualizersBean getEqualizers() {
        return equalizers;
    }

    public void setEqualizers(EqualizersBean equalizers) {
        this.equalizers = equalizers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<SongsBean> getSongs() {
        return songs;
    }

    public void setSongs(List<SongsBean> songs) {
        this.songs = songs;
    }

    public static class EqualizersBean {
    }

    public static class SongsBean {
        /**
         * name : Moon Without The Stars
         * id : 28377211
         * position : 14
         * alias : []
         * status : 0
         * fee : 0
         * copyrightId : 0
         * disc : 2
         * no : 15
         * artists : [{"name":"Quiana","id":194643,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0},{"name":"Jerry Barnes","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}]
         * album : {"name":"古树旋律 Deemo","id":2774288,"type":"专辑","size":127,"picId":6046214441318535,"blurPicUrl":"http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","companyId":0,"pic":6046214441318535,"picUrl":"http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","publishTime":1384272000007,"description":"","tags":"","company":"雷亚游戏","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0},"songs":[],"alias":[],"status":3,"copyrightId":0,"commentThreadId":"R_AL_3_2774288","artists":[{"name":"群星","id":122455,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}],"subType":"录音室版"}
         * starred : false
         * popularity : 95
         * score : 95
         * starredNum : 0
         * duration : 213864
         * playedNum : 0
         * dayPlays : 0
         * hearTime : 0
         * ringtone :
         * crbt : null
         * audition : null
         * copyFrom :
         * commentThreadId : R_SO_4_28377211
         * rtUrl : null
         * ftype : 0
         * rtUrls : []
         * copyright : 2
         * rurl : null
         * hMusic : null
         * mMusic : {"name":"Moon Without The Stars","id":46689711,"size":4300608,"extension":"mp3","sr":44100,"dfsId":6037418348311743,"bitrate":160000,"playTime":213864,"volumeDelta":-2.65076E-4}
         * lMusic : {"name":"Moon Without The Stars","id":46689712,"size":2590737,"extension":"mp3","sr":44100,"dfsId":6027522743661760,"bitrate":96000,"playTime":213864,"volumeDelta":-2.65076E-4}
         * mvid : 0
         * bMusic : {"name":"Moon Without The Stars","id":46689712,"size":2590737,"extension":"mp3","sr":44100,"dfsId":6027522743661760,"bitrate":96000,"playTime":213864,"volumeDelta":-2.65076E-4}
         * mp3Url : http://m2.music.126.net/t24d6GoZRkqxzFAovlZEQw==/6027522743661760.mp3
         * rtype : 0
         */

        private String name;
        private int id;
        private int position;
        private int status;
        private int fee;
        private int copyrightId;
        private String disc;
        private int no;
        private AlbumBean album;
        private boolean starred;
        private int popularity;
        private int score;
        private int starredNum;
        private int duration;
        private int playedNum;
        private int dayPlays;
        private int hearTime;
        private String ringtone;
        private Object crbt;
        private Object audition;
        private String copyFrom;
        private String commentThreadId;
        private Object rtUrl;
        private int ftype;
        private int copyright;
        private Object rurl;
        private Object hMusic;
        private MMusicBean mMusic;
        private LMusicBean lMusic;
        private int mvid;
        private BMusicBean bMusic;
        private String mp3Url;
        private int rtype;
        private List<?> alias;
        private List<ArtistsBeanX> artists;
        private List<?> rtUrls;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public boolean isStarred() {
            return starred;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getStarredNum() {
            return starredNum;
        }

        public void setStarredNum(int starredNum) {
            this.starredNum = starredNum;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getPlayedNum() {
            return playedNum;
        }

        public void setPlayedNum(int playedNum) {
            this.playedNum = playedNum;
        }

        public int getDayPlays() {
            return dayPlays;
        }

        public void setDayPlays(int dayPlays) {
            this.dayPlays = dayPlays;
        }

        public int getHearTime() {
            return hearTime;
        }

        public void setHearTime(int hearTime) {
            this.hearTime = hearTime;
        }

        public String getRingtone() {
            return ringtone;
        }

        public void setRingtone(String ringtone) {
            this.ringtone = ringtone;
        }

        public Object getCrbt() {
            return crbt;
        }

        public void setCrbt(Object crbt) {
            this.crbt = crbt;
        }

        public Object getAudition() {
            return audition;
        }

        public void setAudition(Object audition) {
            this.audition = audition;
        }

        public String getCopyFrom() {
            return copyFrom;
        }

        public void setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public Object getRtUrl() {
            return rtUrl;
        }

        public void setRtUrl(Object rtUrl) {
            this.rtUrl = rtUrl;
        }

        public int getFtype() {
            return ftype;
        }

        public void setFtype(int ftype) {
            this.ftype = ftype;
        }

        public int getCopyright() {
            return copyright;
        }

        public void setCopyright(int copyright) {
            this.copyright = copyright;
        }

        public Object getRurl() {
            return rurl;
        }

        public void setRurl(Object rurl) {
            this.rurl = rurl;
        }

        public Object getHMusic() {
            return hMusic;
        }

        public void setHMusic(Object hMusic) {
            this.hMusic = hMusic;
        }

        public MMusicBean getMMusic() {
            return mMusic;
        }

        public void setMMusic(MMusicBean mMusic) {
            this.mMusic = mMusic;
        }

        public LMusicBean getLMusic() {
            return lMusic;
        }

        public void setLMusic(LMusicBean lMusic) {
            this.lMusic = lMusic;
        }

        public int getMvid() {
            return mvid;
        }

        public void setMvid(int mvid) {
            this.mvid = mvid;
        }

        public BMusicBean getBMusic() {
            return bMusic;
        }

        public void setBMusic(BMusicBean bMusic) {
            this.bMusic = bMusic;
        }

        public String getMp3Url() {
            return mp3Url;
        }

        public void setMp3Url(String mp3Url) {
            this.mp3Url = mp3Url;
        }

        public int getRtype() {
            return rtype;
        }

        public void setRtype(int rtype) {
            this.rtype = rtype;
        }

        public List<?> getAlias() {
            return alias;
        }

        public void setAlias(List<?> alias) {
            this.alias = alias;
        }

        public List<ArtistsBeanX> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBeanX> artists) {
            this.artists = artists;
        }

        public List<?> getRtUrls() {
            return rtUrls;
        }

        public void setRtUrls(List<?> rtUrls) {
            this.rtUrls = rtUrls;
        }

        public static class AlbumBean {
            /**
             * name : 古树旋律 Deemo
             * id : 2774288
             * type : 专辑
             * size : 127
             * picId : 6046214441318535
             * blurPicUrl : http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg
             * companyId : 0
             * pic : 6046214441318535
             * picUrl : http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg
             * publishTime : 1384272000007
             * description :
             * tags :
             * company : 雷亚游戏
             * briefDesc :
             * artist : {"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}
             * songs : []
             * alias : []
             * status : 3
             * copyrightId : 0
             * commentThreadId : R_AL_3_2774288
             * artists : [{"name":"群星","id":122455,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0}]
             * subType : 录音室版
             */

            private String name;
            private int id;
            private String type;
            private int size;
            private long picId;
            private String blurPicUrl;
            private int companyId;
            private long pic;
            private String picUrl;
            private long publishTime;
            private String description;
            private String tags;
            private String company;
            private String briefDesc;
            private ArtistBean artist;
            private int status;
            private int copyrightId;
            private String commentThreadId;
            private String subType;
            private List<?> songs;
            private List<?> alias;
            private List<ArtistsBean> artists;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public long getPicId() {
                return picId;
            }

            public void setPicId(long picId) {
                this.picId = picId;
            }

            public String getBlurPicUrl() {
                return blurPicUrl;
            }

            public void setBlurPicUrl(String blurPicUrl) {
                this.blurPicUrl = blurPicUrl;
            }

            public int getCompanyId() {
                return companyId;
            }

            public void setCompanyId(int companyId) {
                this.companyId = companyId;
            }

            public long getPic() {
                return pic;
            }

            public void setPic(long pic) {
                this.pic = pic;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getCompany() {
                return company;
            }

            public void setCompany(String company) {
                this.company = company;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public ArtistBean getArtist() {
                return artist;
            }

            public void setArtist(ArtistBean artist) {
                this.artist = artist;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCopyrightId() {
                return copyrightId;
            }

            public void setCopyrightId(int copyrightId) {
                this.copyrightId = copyrightId;
            }

            public String getCommentThreadId() {
                return commentThreadId;
            }

            public void setCommentThreadId(String commentThreadId) {
                this.commentThreadId = commentThreadId;
            }

            public String getSubType() {
                return subType;
            }

            public void setSubType(String subType) {
                this.subType = subType;
            }

            public List<?> getSongs() {
                return songs;
            }

            public void setSongs(List<?> songs) {
                this.songs = songs;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public List<ArtistsBean> getArtists() {
                return artists;
            }

            public void setArtists(List<ArtistsBean> artists) {
                this.artists = artists;
            }

            public static class ArtistBean {
                /**
                 * name :
                 * id : 0
                 * picId : 0
                 * img1v1Id : 0
                 * briefDesc :
                 * picUrl : http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                 * img1v1Url : http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                 * albumSize : 0
                 * alias : []
                 * trans :
                 * musicSize : 0
                 */

                private String name;
                private int id;
                private int picId;
                private int img1v1Id;
                private String briefDesc;
                private String picUrl;
                private String img1v1Url;
                private int albumSize;
                private String trans;
                private int musicSize;
                private List<?> alias;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public int getImg1v1Id() {
                    return img1v1Id;
                }

                public void setImg1v1Id(int img1v1Id) {
                    this.img1v1Id = img1v1Id;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public String getTrans() {
                    return trans;
                }

                public void setTrans(String trans) {
                    this.trans = trans;
                }

                public int getMusicSize() {
                    return musicSize;
                }

                public void setMusicSize(int musicSize) {
                    this.musicSize = musicSize;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }

            public static class ArtistsBean {
                /**
                 * name : 群星
                 * id : 122455
                 * picId : 0
                 * img1v1Id : 0
                 * briefDesc :
                 * picUrl : http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                 * img1v1Url : http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                 * albumSize : 0
                 * alias : []
                 * trans :
                 * musicSize : 0
                 */

                private String name;
                private int id;
                private int picId;
                private int img1v1Id;
                private String briefDesc;
                private String picUrl;
                private String img1v1Url;
                private int albumSize;
                private String trans;
                private int musicSize;
                private List<?> alias;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public int getImg1v1Id() {
                    return img1v1Id;
                }

                public void setImg1v1Id(int img1v1Id) {
                    this.img1v1Id = img1v1Id;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public String getTrans() {
                    return trans;
                }

                public void setTrans(String trans) {
                    this.trans = trans;
                }

                public int getMusicSize() {
                    return musicSize;
                }

                public void setMusicSize(int musicSize) {
                    this.musicSize = musicSize;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }
        }

        public static class MMusicBean {
            /**
             * name : Moon Without The Stars
             * id : 46689711
             * size : 4300608
             * extension : mp3
             * sr : 44100
             * dfsId : 6037418348311743
             * bitrate : 160000
             * playTime : 213864
             * volumeDelta : -2.65076E-4
             */

            private String name;
            private int id;
            private int size;
            private String extension;
            private int sr;
            private long dfsId;
            private int bitrate;
            private int playTime;
            private double volumeDelta;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class LMusicBean {
            /**
             * name : Moon Without The Stars
             * id : 46689712
             * size : 2590737
             * extension : mp3
             * sr : 44100
             * dfsId : 6027522743661760
             * bitrate : 96000
             * playTime : 213864
             * volumeDelta : -2.65076E-4
             */

            private String name;
            private int id;
            private int size;
            private String extension;
            private int sr;
            private long dfsId;
            private int bitrate;
            private int playTime;
            private double volumeDelta;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class BMusicBean {
            /**
             * name : Moon Without The Stars
             * id : 46689712
             * size : 2590737
             * extension : mp3
             * sr : 44100
             * dfsId : 6027522743661760
             * bitrate : 96000
             * playTime : 213864
             * volumeDelta : -2.65076E-4
             */

            private String name;
            private int id;
            private int size;
            private String extension;
            private int sr;
            private long dfsId;
            private int bitrate;
            private int playTime;
            private double volumeDelta;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class ArtistsBeanX {
            /**
             * name : Quiana
             * id : 194643
             * picId : 0
             * img1v1Id : 0
             * briefDesc :
             * picUrl : http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
             * img1v1Url : http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
             * albumSize : 0
             * alias : []
             * trans :
             * musicSize : 0
             */

            private String name;
            private int id;
            private int picId;
            private int img1v1Id;
            private String briefDesc;
            private String picUrl;
            private String img1v1Url;
            private int albumSize;
            private String trans;
            private int musicSize;
            private List<?> alias;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPicId() {
                return picId;
            }

            public void setPicId(int picId) {
                this.picId = picId;
            }

            public int getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(int img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }
    }
}
