package com.example.UserService.service;

import java.util.List;

import com.example.UserService.entity.User;

import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserrService {

    @Override
    public User getUser(Long id) {
        List<User> list=List.of(
            new User(123L,"Farida","9876543212"),
            new User(124L, "Sufi","9872345679"),
            new User(125L,"Akhir","9876544874")
        );
        
        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
    
}
