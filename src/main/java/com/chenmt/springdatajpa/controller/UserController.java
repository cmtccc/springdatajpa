package com.chenmt.springdatajpa.controller;

import com.chenmt.springdatajpa.model.User;
import com.chenmt.springdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program springdatajpa
 * @description:
 * @author: chenmet
 * @create: 2018/12/10 10:43
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public String add(User user) {
        userService.save(user);
        return "success";
    }


}
