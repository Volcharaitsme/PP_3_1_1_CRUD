package org.example.pp_3_1_1.service;

import org.example.pp_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
}