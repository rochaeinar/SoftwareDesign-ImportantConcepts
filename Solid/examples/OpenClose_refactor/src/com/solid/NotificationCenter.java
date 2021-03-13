package com.solid;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter {
    private List<NotificationService> services;

    public NotificationCenter() {
        services = new ArrayList<>();
    }

    public void addService(NotificationService service) {
        services.add(service);
    }

    public void notifyAllServices() {
        for (NotificationService service :
                services) {
            service.notify();
        }
    }
}