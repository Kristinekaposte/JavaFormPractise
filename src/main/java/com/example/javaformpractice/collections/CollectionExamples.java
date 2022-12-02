package com.example.javaformpractice.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CollectionExamples {
    public static void main(String[] args) {
        List<String> list3 = Collections.emptyList();// will create empty list works with map etc too,a nd we cant add things to them
        Map<String,Integer> map= Collections.emptyMap();
        List<String> list2 = Collections.singletonList("sam"); // allows only one item in list
        List<Integer> list = Arrays.asList(new Integer [] {1,45,2,6,98});
        System.out.println(Collections.min(list, Collections.reverseOrder()));
    }
}


/*
    Users => name, balance
    Sales => records per user

    get all users sorted by  name
    get all users sorted by  balance ASC
    get all users sorted by most paying DESC
 */
