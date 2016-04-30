package com.example.sangsu.kaokaotalk_sample;

import android.graphics.drawable.Drawable;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class ChattRoom {
   private String name;
    private String content;
    private Drawable photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImage() {
        return photo;
    }

    public void setImage(Drawable image) {
        this.photo = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
