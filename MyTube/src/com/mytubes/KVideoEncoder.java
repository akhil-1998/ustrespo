package com.mytubes;

public class KVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video){
        System.out.println("Encoding Video...!");
        System.out.println("Done...!");
    }
}
