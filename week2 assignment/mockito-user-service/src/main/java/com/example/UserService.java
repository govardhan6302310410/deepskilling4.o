package com.example;

public class UserService {

    private UserRepository repo;

    // Constructor injection
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public String getUserName(int userId) {
        User user = repo.findById(userId);
        return user != null ? user.getName() : "Unknown";
    }
}
