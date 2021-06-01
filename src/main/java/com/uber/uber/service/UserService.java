package com.uber.uber.service;

import com.uber.uber.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers(){
        return List.of(
                new User(
                        "username",
                        "password",
                        "email"
                )
        );
    }
}
