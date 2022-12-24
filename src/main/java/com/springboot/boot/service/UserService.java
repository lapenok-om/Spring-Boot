package com.springboot.boot.service;


import com.springboot.boot.model.User;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    User detUserById(Long id);
    void changeUser(User user);
    void deleteUser(Long id);
}
