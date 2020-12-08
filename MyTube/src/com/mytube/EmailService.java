package com.mytube;

public class EmailService {
    public void sendEmail(User user) {
        System.out.println("Notify " + user.getEmail() + "...");
        System.out.println("Done..");
    }

    }

