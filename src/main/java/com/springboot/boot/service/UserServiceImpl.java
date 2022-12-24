package com.springboot.boot.service;

import com.springboot.boot.dao.UserDao;
import com.springboot.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.listUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.add(user);
    }

    @Override
    public User detUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void changeUser(User user) {
        userDao.changeUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }


}
