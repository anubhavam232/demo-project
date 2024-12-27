package com.scaler.demo.project.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mps_instructor")
public class Instructor extends User{
    private String specialization;
}
