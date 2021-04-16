package com.example.materialdesignapp.part3.model;

public class Music {
    private String name, name_song, time, link_img, favorite_count, song_count;

    public Music() {
    }

    public Music(String name, String link_img) {
        this.name = name;
        this.link_img = link_img;
    }

    public Music(String link_img) {
        this.link_img = link_img;
    }

    public Music(String name, String name_song, String link_img) {
        this.name = name;
        this.name_song = name_song;
        this.link_img = link_img;
    }

    public Music(String name, String name_song, String time, String link_img, String favorite_count) {
        this.name = name;
        this.name_song = name_song;
        this.time = time;
        this.link_img = link_img;
        this.favorite_count = favorite_count;
    }

    public Music(String name, String name_song, String time, String link_img, String favorite_count, String song_count) {
        this.name = name;
        this.name_song = name_song;
        this.time = time;
        this.link_img = link_img;
        this.favorite_count = favorite_count;
        this.song_count = song_count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_song() {
        return name_song;
    }

    public void setName_song(String name_song) {
        this.name_song = name_song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public String getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(String favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getSong_count() {
        return song_count;
    }

    public void setSong_count(String song_count) {
        this.song_count = song_count;
    }
}