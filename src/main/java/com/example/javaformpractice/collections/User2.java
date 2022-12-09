package com.example.javaformpractice.collections;

import java.util.ArrayList;
import java.util.List;

public class User2 {
    private String name;
    public static List<User2> user = new ArrayList<>();

    public User2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static <T> Box<T> createBoxedObject(T t) {
        Box<T> newBox = new Box<T>();
        newBox.setItem(t);
        return newBox;
    }


    public String toString() {
        return "Name " + name;
    }

    public static void main(String[] args) {
        Box<User2> newBoxedUser = createBoxedObject(new User2("Sam"));

    }


}
