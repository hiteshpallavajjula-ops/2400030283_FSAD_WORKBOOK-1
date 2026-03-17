package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Certification certification;

    public void display() {
        System.out.println("Student Details:");
        certification.display();
    }
}
