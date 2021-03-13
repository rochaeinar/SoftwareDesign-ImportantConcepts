package com.solid;

public class UserRepository implements Repository<User> {
    public void Insert(User entity) {
        // save user in DB
    }

    public void Update(User entity) {
        // update user in DB
    }

    public User Get(int id) {
        // retrieve user from DB
        return new User();
    }

    public void Delete(int id) {
        // delete user from DB
    }
}