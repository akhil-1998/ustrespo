package com.mytube;

import java.security.PublicKey;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public String getFileName(){
        return fileName;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
        System.out.println("TITLE: " + title);

    }

    public User getUser(){
        return user;

    }

    public void setUser(User user){
        this.user = user;

    }
}
