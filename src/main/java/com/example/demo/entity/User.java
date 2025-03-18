package com.example.demo.entity;

import java.time.LocalDateTime;

public class User {
    private final int id;
    private final String name;
    private final String mail;
    private final String password;
    private final String roles;
    private final LocalDateTime created;
    private final LocalDateTime lastLogined;
    private final boolean enabled;

    public User(int id, String name, String mail, String password, String roles, LocalDateTime created, LocalDateTime lastLogined, boolean enabled) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
        this.created = created;
        this.lastLogined = lastLogined;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getLastLogined() {
        return lastLogined;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
