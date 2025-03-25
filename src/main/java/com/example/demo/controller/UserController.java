package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 既存の全件取得
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
    
    // IDでユーザー検索
    @GetMapping("/find")
    public User findUser(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }

    // 新規ユーザー追加 (例: GETリクエストで実行)
    @PostMapping("/insert")
    public String insertUser(
            @RequestHeader("username") String username,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestParam(value = "mail", required = false, defaultValue = "default@mail.com") String mail) {
        // ここではIDは0としておき、insert時に自動生成されるものとする
        User newUser = new User(0, username, mail, password, roles, LocalDateTime.now(), LocalDateTime.now(), true);
        int generatedId = userService.createUser(newUser);
        return generatedId > 0 ? "Insert successful with ID: " + generatedId : "Insert failed";
    }

    // ユーザー更新 (例: GETリクエストで実行)
    @PostMapping("/update")
    public String updateUser(
            @RequestParam("id") int id,
            @RequestHeader("username") String username,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestParam(value = "mail", required = false, defaultValue = "default@mail.com") String mail) {
        User updatedUser = new User(id, username, mail, password, roles, LocalDateTime.now(), LocalDateTime.now(), true);
        int updatedRowCount = userService.updateUser(id, updatedUser);
        return updatedRowCount > 0 ? "Update successful (Updated rows: " + updatedRowCount + ")" : "Update failed";
    }

    // 例外を投げるエンドポイント
    @GetMapping("/exception")
    public void throwException() throws Exception {
        throw new Exception("This is a generic exception");
    }

    @GetMapping("/ApplicationException")
    public void throwApplicationException() {
        throw new ApplicationException(Errors.INVALID_REQUEST);
    }
}
