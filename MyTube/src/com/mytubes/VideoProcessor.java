package com.mytubes;

public class VideoProcessor {

    public VideoEncoder encoder;
    public VideoDatabase database;
    public NotificationService notificationService;

    public VideoProcessor(VideoEncoder encoder,
                          VideoDatabase database,
                          NotificationService notificationService){
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }
    public void process(Video video){

    }
}
