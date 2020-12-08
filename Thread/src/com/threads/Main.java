package com.threads;

public class Main extends Thread {

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Out of thread");

    }
    public void run(){
        System.out.println("Inside thread");
    }
}
