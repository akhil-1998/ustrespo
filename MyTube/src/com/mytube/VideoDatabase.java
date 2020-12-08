package com.mytube;

public class VideoDatabase {
    public void store(Video video){
        System.out.println("Storing video Metadata in sql database..");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File name" + video.getFileName());
        System.out.println("Done..");
        
    }

    public void store() {
    }
}
