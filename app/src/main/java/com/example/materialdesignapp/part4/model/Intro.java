package com.example.materialdesignapp.part4.model;

public class Intro {

    //if u want use url use String for lottie
    private int lottie;
    private String description;

    public Intro(int lottie, String description) {
        this.lottie = lottie;
        this.description = description;
    }

    public int getLottie() {
        return lottie;
    }

    public void setLottie(int lottie) {
        this.lottie = lottie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
