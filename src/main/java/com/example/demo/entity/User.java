package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class User {
    private final int id;
    private final String name;
    private final String mail;
    private final String password;
    private final String roles;
    private final LocalDateTime created;
    private final LocalDateTime lastLogined;
    private final boolean enabled;
}
