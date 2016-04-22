package com.example.sangsu.kaokaotalk_sample;

import android.graphics.drawable.Drawable;

/**
 * Created by Duedapi on 2016-04-23.
 */
public class Friend {

    private String name;
    private Drawable photo;

    public Friend(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }
}
