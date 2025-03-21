package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
    
    public User getUserById(int id) {
        return userMapper.findById(id);
    }

    public int createUser(User user) {
        return userMapper.insert(user);
    }

    public int updateUser(int id, User user) {
        return userMapper.update(id, user);
    }
}
