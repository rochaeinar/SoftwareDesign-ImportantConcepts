package com.solid;

public class LogRepository implements ReadRepository<EventLog> {

    public EventLog Get(int id) {
        // retrieve log from DB
        return new EventLog();
    }
}