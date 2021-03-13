package com.solid;

public class Main {

    public static void main(String[] args) {
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.addService(new EmailNotification());
        notificationCenter.addService(new TextNotification());
        notificationCenter.addService(new FacebookNotification());
        notificationCenter.notify();
    }
}
