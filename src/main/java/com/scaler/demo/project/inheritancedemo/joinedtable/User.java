package com.scaler.demo.project.inheritancedemo.joinedtable;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
}
