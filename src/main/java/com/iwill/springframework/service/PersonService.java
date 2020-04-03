package com.iwill.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private UserService userService ;

    public String getName(){
        return "Person";
    }
}
