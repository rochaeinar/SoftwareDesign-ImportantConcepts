package com.solid;

public class LogRepository implements Repository<EventLog> {
    public void Insert(EventLog entity) {
        // nothing to do
    }

    public void Update(EventLog entity) {
        // nothing to do
    }

    public EventLog Get(int id) {
        // retrieve log from DB
        return new EventLog();
    }

    public void Delete(int id) {
        // nothing to do
    }
}