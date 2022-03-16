package com.example.ContactService.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.ContactService.entity.Contact;

import org.springframework.stereotype.Service;
@Service
public class ContactServiceImpl implements ContacttService {

    List<Contact> list=List.of(
        new Contact(1L, "farida@gmail.com","Farida",123L),
        new Contact(2L, "sufi@gmail.com","Sufi",124L),
        new Contact(3L, "akhir@gmail.com","Akhir",125L),
        new Contact(4L, "farida@gmail.com","Farida",126L)

    );
    @Override
    public List<Contact> getContactOfUsers(Long userId) {
       
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
    
}
