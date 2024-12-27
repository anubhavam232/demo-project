package com.scaler.demo.project.inheritancedemo.singletable;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userType", discriminatorType = DiscriminatorType.INTEGER)
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
}
