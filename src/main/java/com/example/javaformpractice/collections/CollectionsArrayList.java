package com.example.javaformpractice.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsArrayList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add(0,"sam");
        names.add(0,"andrew");

       System.out.println(names.get(0));

//        for (String nam : names) {
//            System.out.println(nam);
//        }
    }
}
//0(1) -- constant time  (array list)
// 0(n) --> linear time --> more inputs takes more time to do action

// 0(n) linkedList - need to start to first position to find next