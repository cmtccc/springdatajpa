package com.chenmt.springdatajpa.service.impl;

import com.chenmt.springdatajpa.dao.UserDao;
import com.chenmt.springdatajpa.model.User;
import com.chenmt.springdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program springdatajpa
 * @description:
 * @author: chenmet
 * @create: 2018/12/10 10:39
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userDao.getOne(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void edit(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(findUserById(id));
    }

}
