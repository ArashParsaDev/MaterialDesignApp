package com.example.materialdesignapp.part3.model;

public class MusicVideo {

    private String link_img,link_video;

    public MusicVideo(String link_img, String link_video) {
        this.link_img = link_img;
        this.link_video = link_video;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public String getLink_video() {
        return link_video;
    }

    public void setLink_video(String link_video) {
        this.link_video = link_video;
    }
}
