package com.uber.uber.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    private String username;
    private String email;
    private String password;
}
