package com.example.ContactService.controller;

import java.util.List;

import com.example.ContactService.entity.Contact;
import com.example.ContactService.service.ContacttService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
   private ContacttService cs;
@GetMapping("/user/{userId}")
public List<Contact> getContacts(@PathVariable("userId") Long userId ){
    return this.cs.getContactOfUsers(userId);
}
    
    
}
