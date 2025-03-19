package com.example.demo.repository.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findById(@Param("id") int id);

    int insert(User user);

    int update(@Param("id") int id, @Param("user") User user);
}
