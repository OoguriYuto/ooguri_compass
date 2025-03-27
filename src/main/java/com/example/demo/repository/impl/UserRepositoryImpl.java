package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;
import com.example.demo.repository.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Slf4j
@Repository
public class UserRepositoryImpl {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        try {
            return userMapper.findAll();
        } catch (DataAccessException e) {
            log.error("Error in findAll", e);
            throw new ApplicationException(Errors.DB_ERROR);
        }
    }

    public User findById(int id) {
        try {
            return userMapper.findById(id);
        } catch (DataAccessException e) {
            log.error("Error in findById for id: {}", id, e);
            throw new ApplicationException(Errors.DB_ERROR);
        }
    }

    public int insert(User user) {
        try {
            return userMapper.insert(user);
        } catch (DataAccessException e) {
            log.error("Error in insert", e);
            throw new ApplicationException(Errors.DB_ERROR);
        }
    }

    public int update(int id, User user) {
        try {
            return userMapper.update(id, user);
        } catch (DataAccessException e) {
            log.error("Error in update for id: {}", id, e);
            throw new ApplicationException(Errors.DB_ERROR);
        }
    }
}
