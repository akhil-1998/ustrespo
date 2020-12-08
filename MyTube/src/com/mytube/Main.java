package com.mytube;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var video = new Video();
        video.setTitle("Birthday.mp4");
        video.setTitle("Angels Birthday");
        video.setUser(new User("Akhil"));

        var processor = new VideoProcessor();
        processor.process(video);
    }
}
