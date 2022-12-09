package com.example.javaformpractice.generics;

import java.time.LocalDate;

public class User {
    public String name;
    public LocalDate dob;
    public  User(String name, LocalDate dob){
        this.name=name;
        this.dob=dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
