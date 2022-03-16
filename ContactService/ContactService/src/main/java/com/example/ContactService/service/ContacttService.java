package com.example.ContactService.service;

import java.util.List;

import com.example.ContactService.entity.Contact;

import org.springframework.stereotype.Service;
public interface ContacttService {
    public List<Contact> getContactOfUsers(Long userId);
}
