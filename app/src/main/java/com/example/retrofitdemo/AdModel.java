package com.example.retrofitdemo;

import java.util.List;

/**
 * Created by iuu on 17-8-8.
 */

public class AdModel {

    /**
     * total : 6
     * per_page : 6
     * current_page : 1
     * last_page : 1
     * next_page_url : null
     * prev_page_url : null
     * from : 1
     * to : 6
     * data : [{"id":134,"gold":4,"name":"人人车","path":"http://om2nwa523.bkt.clouddn.com/member_task_video_20170502131744.mp4","time":"00:00:15","image_path":"http://om2nwa523.bkt.clouddn.com","image_base_name":"member_task_video_20170502131744.mp4.jpg","updated_at":"2017-05-02 13:17:45","key":"member_task_video_20170502131744.mp4","qiniu_image_path":null,"qiniu_path":null},{"id":131,"gold":12,"name":"测试任务","path":"http://om2nwa523.bkt.clouddn.com/member_task_video_20170502130328.mp4","time":"00:00:03","image_path":"http://om2nwa523.bkt.clouddn.com","image_base_name":"member_task_video_20170502130328.mp4.jpg","updated_at":"2017-05-02 13:03:29","key":"member_task_video_20170502130328.mp4","qiniu_image_path":null,"qiniu_path":null},{"id":130,"gold":11,"name":"册书","path":"http://om2nwa523.bkt.clouddn.com/member_task_video_20170502130232.mp4","time":"00:00:03","image_path":"http://om2nwa523.bkt.clouddn.com","image_base_name":"member_task_video_20170502130232.mp4.jpg","updated_at":"2017-05-02 13:02:33","key":"member_task_video_20170502130232.mp4","qiniu_image_path":null,"qiniu_path":null},{"id":126,"gold":1,"name":"歌曲","path":"http://testvideo.bjaiyouyou.com/member_task_video_20170413143709.mp4","time":"00:00:03","image_path":"http://testvideo.bjaiyouyou.com","image_base_name":"member_task_video_20170413143709.mp4.jpg","updated_at":"2017-04-13 14:37:15","key":"member_task_video_20170413143709.mp4","qiniu_image_path":null,"qiniu_path":null},{"id":124,"gold":1,"name":"囚牛","path":"http://om2nwa523.bkt.clouddn.com/member_task_video_20170307171626.mp4","time":"00:00:03","image_path":"http://om2nwa523.bkt.clouddn.com","image_base_name":"member_task_video_20170307171626.mp4.jpg","updated_at":"2017-03-07 17:16:29","key":"member_task_video_20170307171626.mp4","qiniu_image_path":null,"qiniu_path":null},{"id":123,"gold":1,"name":"11111","path":"http://om2nwa523.bkt.clouddn.com/member_task_video_20170307143952.mp4","time":"00:00:46","image_path":"http://om2nwa523.bkt.clouddn.com","image_base_name":"member_task_video_20170307143952.mp4.jpg","updated_at":"2017-03-07 14:40:22","key":"member_task_video_20170307143952.mp4","qiniu_image_path":null,"qiniu_path":null}]
     */

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private Object next_page_url;
    private Object prev_page_url;
    private int from;
    private int to;
    private List<DataBean> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public Object getNext_page_url() {
        return next_page_url;
    }

    public void setNext_page_url(Object next_page_url) {
        this.next_page_url = next_page_url;
    }

    public Object getPrev_page_url() {
        return prev_page_url;
    }

    public void setPrev_page_url(Object prev_page_url) {
        this.prev_page_url = prev_page_url;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 134
         * gold : 4
         * name : 人人车
         * path : http://om2nwa523.bkt.clouddn.com/member_task_video_20170502131744.mp4
         * time : 00:00:15
         * image_path : http://om2nwa523.bkt.clouddn.com
         * image_base_name : member_task_video_20170502131744.mp4.jpg
         * updated_at : 2017-05-02 13:17:45
         * key : member_task_video_20170502131744.mp4
         * qiniu_image_path : null
         * qiniu_path : null
         */

        private int id;
        private int gold;
        private String name;
        private String path;
        private String time;
        private String image_path;
        private String image_base_name;
        private String updated_at;
        private String key;
        private Object qiniu_image_path;
        private Object qiniu_path;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getImage_path() {
            return image_path;
        }

        public void setImage_path(String image_path) {
            this.image_path = image_path;
        }

        public String getImage_base_name() {
            return image_base_name;
        }

        public void setImage_base_name(String image_base_name) {
            this.image_base_name = image_base_name;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getQiniu_image_path() {
            return qiniu_image_path;
        }

        public void setQiniu_image_path(Object qiniu_image_path) {
            this.qiniu_image_path = qiniu_image_path;
        }

        public Object getQiniu_path() {
            return qiniu_path;
        }

        public void setQiniu_path(Object qiniu_path) {
            this.qiniu_path = qiniu_path;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", gold=" + gold +
                    ", name='" + name + '\'' +
                    ", path='" + path + '\'' +
                    ", time='" + time + '\'' +
                    ", image_path='" + image_path + '\'' +
                    ", image_base_name='" + image_base_name + '\'' +
                    ", updated_at='" + updated_at + '\'' +
                    ", key='" + key + '\'' +
                    ", qiniu_image_path=" + qiniu_image_path +
                    ", qiniu_path=" + qiniu_path +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdModel{" +
                "total=" + total +
                ", per_page=" + per_page +
                ", current_page=" + current_page +
                ", last_page=" + last_page +
                ", next_page_url=" + next_page_url +
                ", prev_page_url=" + prev_page_url +
                ", from=" + from +
                ", to=" + to +
                ", data=" + data +
                '}';
    }
}
