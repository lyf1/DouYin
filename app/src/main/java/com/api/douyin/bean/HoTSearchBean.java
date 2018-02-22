package com.api.douyin.bean;

import java.util.List;

/**
 * Created by lenovo on 2018/2/22.
 */

public class HoTSearchBean {

    /**
     * status_code : 0
     * status_msg :
     * data : [{"challenge":{"schema":"aweme://aweme/challenge/detail?cid=1592199944104983","user_count":0,"author":{},"cha_name":"我也来玩\u201c旧照新拍\u201d！","cid":"1592199944104983","type":0,"desc":"小时候照片里的你\u2014\u2014天真懵懂的表情，肆意搞怪的动作；爸妈们芳华岁月里穿着夹克衫，喇叭裤的装扮。若是多年后的今天再去模仿当时照片里的样子，让人不禁感慨时光的脚步匆匆的同时，对比与反差也可以说是相当有喜感了～\n新年的你又长大一岁，童年的画面或年轻的模样是否勾起了你的回忆杀？赶快和照片中的亲人，朋友一起旧照新拍，再来一波怀旧风吧~"},"type":2},{"type":3,"music":{"status":1,"extra":"{\"has_edited\": 0}","is_original":true,"offline_desc":"","source_platform":25,"cover_large":{"url_list":["http://p3.pstatp.com/live/720x720/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"duration":37,"id":6519408540544764685,"cover_thumb":{"url_list":["http://p3.pstatp.com/live/100x100/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"cover_hd":{"url_list":["http://p3.pstatp.com/live/1080x1080/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"user_count":0,"title":"白羊","play_url":{"url_list":["http://p1.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p9.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p3.pstatp.com/obj/aweme-original-music/1591652342001709.wav"],"uri":"aweme-original-music/1591652342001709.wav"},"author":"徐秉龙","mid":"6519408540544764685","cover_medium":{"url_list":["http://p3.pstatp.com/live/200x200/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"id_str":"6519408540544764685","schema_url":"","owner_id":"76049764781"}},{"challenge":{"schema":"aweme://aweme/challenge/detail?cid=1592167862662157","user_count":0,"author":{},"cha_name":"过年回家与父母的斗智斗勇","cid":"1592167862662157","type":0,"desc":"你在父母催婚时都是怎样斗智斗勇的呢?!把被催婚时场景还原出来,只要够好笑,你也会在大事件第六季出现!我还会给他一千元的奖"},"type":2},{"challenge":{"schema":"aweme://aweme/challenge/detail?cid=1592174664969219","user_count":0,"author":{},"cha_name":"介绍一下，这是我的家乡","cid":"1592174664969219","type":0,"desc":"\u201c和我在成都的街头走一走~直到所有的灯都熄灭了也不停留~\u201d一首《成都》唱出了成都引人向往的意境，那么有没有一首歌，也唱出了你的家乡？\n今年春节你在哪里？是不是也回到了家乡呢？选择一首最能代表你家乡的歌，用transition的方式来介绍一下自己的家乡吧！\nps：抖音君，为大家准备了【家乡】歌单可供选择，快去看看有没有你的家乡吧~"},"type":2},{"challenge":{"schema":"aweme://aweme/challenge/detail?cid=1592175536010254","user_count":0,"author":{},"cha_name":"牵妈妈的手","cid":"1592175536010254","type":0,"desc":"牵妈妈的手，给妈妈一个拥抱，记录幸福瞬间；讲妈妈的故事，炫妈妈的拿手菜，传递母爱亲情。"},"type":2},{"challenge":{"schema":"aweme://aweme/challenge/detail?cid=1592176390505476","user_count":0,"author":{},"cha_name":"你知道什么是\u201c豆芽抖\u201d吗？","cid":"1592176390505476","type":0,"desc":"\u2014\u2014\u201c你知道什么是\u2018豆芽抖\u2019吗？\u201d\n\u2014\u2014\u201c\u2018豆芽抖\u2019就是\u2014\u2014抖！抖！抖！豆芽抖！\u201d\n豆芽们，新年魔性豆芽抖来啦！悄悄告诉你，听说可以抖掉不开心，抖掉所有坏运气哦！\n快来选择推荐音乐【I am 豆芽】，拍出一支\u201c豆芽抖\u201d吧！新的一年，好运滚滚来！"},"type":2}]
     * extra : {"logid":"201802221100360100150311519763D3","now":1519268437007,"fatal_item_ids":[]}
     */

    private int status_code;
    private String status_msg;
    private ExtraBean extra;
    private List<DataBean> data;

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getStatus_msg() {
        return status_msg;
    }

    public void setStatus_msg(String status_msg) {
        this.status_msg = status_msg;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class ExtraBean {
        /**
         * logid : 201802221100360100150311519763D3
         * now : 1519268437007
         * fatal_item_ids : []
         */

        private String logid;
        private long now;
        private List<?> fatal_item_ids;

        public String getLogid() {
            return logid;
        }

        public void setLogid(String logid) {
            this.logid = logid;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public List<?> getFatal_item_ids() {
            return fatal_item_ids;
        }

        public void setFatal_item_ids(List<?> fatal_item_ids) {
            this.fatal_item_ids = fatal_item_ids;
        }
    }

    public static class DataBean {
        /**
         * challenge : {"schema":"aweme://aweme/challenge/detail?cid=1592199944104983","user_count":0,"author":{},"cha_name":"我也来玩\u201c旧照新拍\u201d！","cid":"1592199944104983","type":0,"desc":"小时候照片里的你\u2014\u2014天真懵懂的表情，肆意搞怪的动作；爸妈们芳华岁月里穿着夹克衫，喇叭裤的装扮。若是多年后的今天再去模仿当时照片里的样子，让人不禁感慨时光的脚步匆匆的同时，对比与反差也可以说是相当有喜感了～\n新年的你又长大一岁，童年的画面或年轻的模样是否勾起了你的回忆杀？赶快和照片中的亲人，朋友一起旧照新拍，再来一波怀旧风吧~"}
         * type : 2
         * music : {"status":1,"extra":"{\"has_edited\": 0}","is_original":true,"offline_desc":"","source_platform":25,"cover_large":{"url_list":["http://p3.pstatp.com/live/720x720/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"duration":37,"id":6519408540544764685,"cover_thumb":{"url_list":["http://p3.pstatp.com/live/100x100/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"cover_hd":{"url_list":["http://p3.pstatp.com/live/1080x1080/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"user_count":0,"title":"白羊","play_url":{"url_list":["http://p1.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p9.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p3.pstatp.com/obj/aweme-original-music/1591652342001709.wav"],"uri":"aweme-original-music/1591652342001709.wav"},"author":"徐秉龙","mid":"6519408540544764685","cover_medium":{"url_list":["http://p3.pstatp.com/live/200x200/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"},"id_str":"6519408540544764685","schema_url":"","owner_id":"76049764781"}
         */

        private ChallengeBean challenge;
        private int type;
        private MusicBean music;

        public ChallengeBean getChallenge() {
            return challenge;
        }

        public void setChallenge(ChallengeBean challenge) {
            this.challenge = challenge;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public MusicBean getMusic() {
            return music;
        }

        public void setMusic(MusicBean music) {
            this.music = music;
        }

        public static class ChallengeBean {
            /**
             * schema : aweme://aweme/challenge/detail?cid=1592199944104983
             * user_count : 0
             * author : {}
             * cha_name : 我也来玩“旧照新拍”！
             * cid : 1592199944104983
             * type : 0
             * desc : 小时候照片里的你——天真懵懂的表情，肆意搞怪的动作；爸妈们芳华岁月里穿着夹克衫，喇叭裤的装扮。若是多年后的今天再去模仿当时照片里的样子，让人不禁感慨时光的脚步匆匆的同时，对比与反差也可以说是相当有喜感了～
             新年的你又长大一岁，童年的画面或年轻的模样是否勾起了你的回忆杀？赶快和照片中的亲人，朋友一起旧照新拍，再来一波怀旧风吧~
             */

            private String schema;
            private int user_count;
            private AuthorBean author;
            private String cha_name;
            private String cid;
            private int type;
            private String desc;

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getCha_name() {
                return cha_name;
            }

            public void setCha_name(String cha_name) {
                this.cha_name = cha_name;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class AuthorBean {
            }
        }

        public static class MusicBean {
            /**
             * status : 1
             * extra : {"has_edited": 0}
             * is_original : true
             * offline_desc :
             * source_platform : 25
             * cover_large : {"url_list":["http://p3.pstatp.com/live/720x720/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"}
             * duration : 37
             * id : 6519408540544764685
             * cover_thumb : {"url_list":["http://p3.pstatp.com/live/100x100/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"}
             * cover_hd : {"url_list":["http://p3.pstatp.com/live/1080x1080/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"}
             * user_count : 0
             * title : 白羊
             * play_url : {"url_list":["http://p1.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p9.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p3.pstatp.com/obj/aweme-original-music/1591652342001709.wav"],"uri":"aweme-original-music/1591652342001709.wav"}
             * author : 徐秉龙
             * mid : 6519408540544764685
             * cover_medium : {"url_list":["http://p3.pstatp.com/live/200x200/aweme-original-music/1591652342028307.jpeg"],"uri":"aweme-original-music/1591652342028307"}
             * id_str : 6519408540544764685
             * schema_url :
             * owner_id : 76049764781
             */

            private int status;
            private String extra;
            private boolean is_original;
            private String offline_desc;
            private int source_platform;
            private CoverLargeBean cover_large;
            private int duration;
            private long id;
            private CoverThumbBean cover_thumb;
            private CoverHdBean cover_hd;
            private int user_count;
            private String title;
            private PlayUrlBean play_url;
            private String author;
            private String mid;
            private CoverMediumBean cover_medium;
            private String id_str;
            private String schema_url;
            private String owner_id;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public boolean isIs_original() {
                return is_original;
            }

            public void setIs_original(boolean is_original) {
                this.is_original = is_original;
            }

            public String getOffline_desc() {
                return offline_desc;
            }

            public void setOffline_desc(String offline_desc) {
                this.offline_desc = offline_desc;
            }

            public int getSource_platform() {
                return source_platform;
            }

            public void setSource_platform(int source_platform) {
                this.source_platform = source_platform;
            }

            public CoverLargeBean getCover_large() {
                return cover_large;
            }

            public void setCover_large(CoverLargeBean cover_large) {
                this.cover_large = cover_large;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public CoverThumbBean getCover_thumb() {
                return cover_thumb;
            }

            public void setCover_thumb(CoverThumbBean cover_thumb) {
                this.cover_thumb = cover_thumb;
            }

            public CoverHdBean getCover_hd() {
                return cover_hd;
            }

            public void setCover_hd(CoverHdBean cover_hd) {
                this.cover_hd = cover_hd;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public PlayUrlBean getPlay_url() {
                return play_url;
            }

            public void setPlay_url(PlayUrlBean play_url) {
                this.play_url = play_url;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public CoverMediumBean getCover_medium() {
                return cover_medium;
            }

            public void setCover_medium(CoverMediumBean cover_medium) {
                this.cover_medium = cover_medium;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public String getSchema_url() {
                return schema_url;
            }

            public void setSchema_url(String schema_url) {
                this.schema_url = schema_url;
            }

            public String getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(String owner_id) {
                this.owner_id = owner_id;
            }

            public static class CoverLargeBean {
                /**
                 * url_list : ["http://p3.pstatp.com/live/720x720/aweme-original-music/1591652342028307.jpeg"]
                 * uri : aweme-original-music/1591652342028307
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverThumbBean {
                /**
                 * url_list : ["http://p3.pstatp.com/live/100x100/aweme-original-music/1591652342028307.jpeg"]
                 * uri : aweme-original-music/1591652342028307
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverHdBean {
                /**
                 * url_list : ["http://p3.pstatp.com/live/1080x1080/aweme-original-music/1591652342028307.jpeg"]
                 * uri : aweme-original-music/1591652342028307
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayUrlBean {
                /**
                 * url_list : ["http://p1.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p9.pstatp.com/obj/aweme-original-music/1591652342001709.wav","http://p3.pstatp.com/obj/aweme-original-music/1591652342001709.wav"]
                 * uri : aweme-original-music/1591652342001709.wav
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverMediumBean {
                /**
                 * url_list : ["http://p3.pstatp.com/live/200x200/aweme-original-music/1591652342028307.jpeg"]
                 * uri : aweme-original-music/1591652342028307
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }
    }
}
