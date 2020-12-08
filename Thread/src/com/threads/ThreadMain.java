package com.threads;

public class ThreadMain implements Runnable {

    public static void main(String[] args) {
        Main mainObj = new Main();
        Thread thread = new Thread(mainObj);
        thread.start();
        System.out.println("Out of thread");

    }
    public void run(){
        System.out.println("Inside thread");
    }
}
