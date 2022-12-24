package com.springboot.boot.dao;


import com.springboot.boot.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getUserById(Long id);
    void changeUser(User user);
    void deleteUser(Long id);
}
