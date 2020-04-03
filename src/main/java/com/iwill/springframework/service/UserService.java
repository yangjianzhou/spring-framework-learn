package com.iwill.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PersonService personService;

    public String getName(){
        return "User";
    }
}
