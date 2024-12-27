package com.scaler.demo.project.inheritancedemo.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentor")
public class Mentor extends User {
    private String companyName;
    private double avgRating;
}
