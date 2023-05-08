package com.example.gridviewdemo;

public class Footballer {
    private String name;
    private String number;
    private int imageId;
    private String speech;

    public Footballer(String name, String number, int imageId, String speech) {
        this.name = name;
        this.number = number;
        this.imageId = imageId;
        this.speech = speech;
    }

    public Footballer(String name, String number, int imageId) {
        this(name, number, imageId, "HALA MADRID!");
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getImageId() {
        return imageId;
    }

    public String getSpeech() {
        return speech;
    }
}
