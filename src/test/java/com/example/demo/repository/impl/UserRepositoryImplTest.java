package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    void findByIdNormalTest() {
        // application.yml の設定により、schema.sql と data.sql が自動ロードされる前提
        // data.sql により、ID=1 のユーザーの名前が "test" として挿入されている
        User user = userRepository.findById(1);
        assertNotNull(user, "ユーザーがnullであってはならない");
        assertEquals("test1", user.getName(), "ユーザー名が 'test1' であること");
        assertEquals("test@example.com", user.getMail(), "メールアドレスが 'test@example.com' であること");
    }
}
