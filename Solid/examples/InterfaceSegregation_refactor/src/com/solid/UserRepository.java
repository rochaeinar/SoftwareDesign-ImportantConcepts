package com.solid;

public class UserRepository implements ReadRepository<User>, WriteRepository<User> {
    public void Insert(User entity) {
        // save user in DB
    }

    public User Get(int id) {
        // retrieve user from DB
        return new User();
    }

    public void Delete(int id) {
        // delete user from DB
    }

    @Override
    public User Update(int id) {
        return null;
    }
}