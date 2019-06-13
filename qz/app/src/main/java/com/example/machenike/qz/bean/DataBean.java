package com.example.machenike.qz.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class DataBean {
        @Id(autoincrement = true)
     private Long newId;
        private String desc;
        private int id;
        private String imagePath;
        private int isVisible;
        private int order;
        private String title;
        private int type;
        private String url;
        @Generated(hash = 409531191)
        public DataBean(Long newId, String desc, int id, String imagePath,
                int isVisible, int order, String title, int type, String url) {
            this.newId = newId;
            this.desc = desc;
            this.id = id;
            this.imagePath = imagePath;
            this.isVisible = isVisible;
            this.order = order;
            this.title = title;
            this.type = type;
            this.url = url;
        }
        @Generated(hash = 908697775)
        public DataBean() {
        }
        public Long getNewId() {
            return this.newId;
        }
        public void setNewId(Long newId) {
            this.newId = newId;
        }
        public String getDesc() {
            return this.desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        public int getId() {
            return this.id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getImagePath() {
            return this.imagePath;
        }
        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }
        public int getIsVisible() {
            return this.isVisible;
        }
        public void setIsVisible(int isVisible) {
            this.isVisible = isVisible;
        }
        public int getOrder() {
            return this.order;
        }
        public void setOrder(int order) {
            this.order = order;
        }
        public String getTitle() {
            return this.title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public int getType() {
            return this.type;
        }
        public void setType(int type) {
            this.type = type;
        }
        public String getUrl() {
            return this.url;
        }
        public void setUrl(String url) {
            this.url = url;
        }

}
