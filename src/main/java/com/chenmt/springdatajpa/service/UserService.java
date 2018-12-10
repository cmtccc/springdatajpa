package com.chenmt.springdatajpa.service;

import com.chenmt.springdatajpa.model.User;

import java.util.List;

/**
 * @program springdatajpa
 * @description: 用户业务
 * @author: chenmet
 * @create: 2018/12/10 10:28
 */
public interface UserService {

    List<User> getUserList();

    User findUserById(long id);

    void save(User user);

    void edit(User user);

    void delete(long id);

}
