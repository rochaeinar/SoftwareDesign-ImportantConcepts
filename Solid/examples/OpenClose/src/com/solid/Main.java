package com.solid;

public class Main {

    public static void main(String[] args) {
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.NotifyByEmail(new User(), "test");
    }
}
