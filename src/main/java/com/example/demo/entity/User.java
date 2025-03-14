package com.example.demo.entity; // パッケージが正しいか確認

public class User {
    private int id;
    private String name;
    private String mail;

    // ゲッターとセッター
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmail() {
        return mail;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }
}
