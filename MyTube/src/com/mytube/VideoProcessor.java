package com.mytube;

public class VideoProcessor {
    public void process(Video video){
        //Encoder
        var encoder = new VideoEncoder();
        encoder.encode(video);

        //Database
        var database = new VideoDatabase();
        database.store();


        //EmailService
        var emailservice = new EmailService();
        emailservice.sendEmail(video.getUser());

    }
}
