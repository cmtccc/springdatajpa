package com.chenmt.springdatajpa.dao;

import com.chenmt.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program springdatajpa
 * @description: dao
 * @author: chenmet
 * @create: 2018/12/10 10:36
 */
public interface UserDao extends JpaRepository<User, Long> {

}
