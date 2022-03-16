package com.example.UserService.controller;

import java.util.List;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserrService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserrService us;

    @Autowired
    RestTemplate rt;
    @GetMapping("/{userId}")
     public User getUser(@PathVariable("userId") Long userId){
         User user=this.us.getUser(userId);
         List contacts=this.rt.getForObject("http://contact-service/contact/user/"+user.getUserId(),List.class);
        user.setContacts(contacts);
         return user;
         
     }
}
