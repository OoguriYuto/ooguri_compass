package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    @DisplayName("IDでデータ取得ができ、全フィールドが期待通りであるテスト")
    void findByIdNormalTest() {
        User user = userRepository.findById(1);
        
        assertEquals(1, user.getId(), "IDが1であること");
        assertEquals("test", user.getName(), "名前が 'test' であること");
        assertEquals("test@example.com", user.getMail(), "メールアドレスが 'test@example.com' であること");
        assertEquals("secret", user.getPassword(), "パスワードが 'secret' であること");
        assertEquals("USER", user.getRoles(), "役割が 'USER' であること");
        assertEquals(LocalDateTime.of(2023, 1, 1, 0, 0, 0), user.getCreated(), "作成日時が '2023-01-01 00:00:00' であること");
        assertEquals(LocalDateTime.of(2023, 1, 1, 0, 0, 0), user.getLastLogined(), "最終ログイン日時が '2023-01-01 00:00:00' であること");
        assertEquals(true, user.isEnabled(), "有効フラグが true であること");
    }
}
