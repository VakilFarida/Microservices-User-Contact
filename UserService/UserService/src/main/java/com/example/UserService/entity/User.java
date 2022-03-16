package com.example.UserService.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class User {
    private Long UserId;
    private String name;
    private String phone;
    List<Contact> contacts=new ArrayList<>();
    public User(Long userId, String name, String phone, List<Contact> contacts) {
        UserId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }
    public User(Long userId, String name, String phone) {
        UserId = userId;
        this.name = name;
        this.phone = phone;
    }
    public User() {
    }


}
