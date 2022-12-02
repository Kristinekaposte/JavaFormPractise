package com.example.javaformpractice.collections;

import com.example.javaformpractice.BlackKnight;

import java.util.*;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public User(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public int compareTo(User user) {
        int compare = 0;
        compare = firstName.toLowerCase().compareTo(user.getFirstName().toLowerCase());
        if (compare == 0) {
            // will continue to compare if they have same first name
            compare = lastName.toLowerCase().compareTo(user.getLastName().toLowerCase());}
        if (compare == 0) {
            // will continue to compare if they have same last name
            compare = Integer.compare(age, user.getAge());}
        if (compare == 0) {
            // will continue to compare if they have same age
            compare = Integer.compare(height, user.getHeight());
        }
        return compare;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + " " + this.height;

    }

    public static void main(String[] args) {
        User user1 = new User("John", "Smith", 20, 165);
        User user2 = new User("John", "Smith", 20, 150);
      //  User user2 = new User("John", "Bravo", 21, 166);
     //   User user3 = new User("Adam", "Smith", 63, 170);

        List mylist = new ArrayList();
        mylist.add(user1);
        mylist.add(user2);
     //   mylist.add(user3);

        System.out.println("---------Unsorted--------------------");
        System.out.println(mylist.toString());
        System.out.println("-----------------------------");
        Collections.sort(mylist);

//        System.out.println(mylist.toString());
//        System.out.println("-----------------------------");
      //  System.out.println(user1.compareTo(user2));
        for (Object myUser : mylist) {
            System.out.println(myUser.toString());
        }








    int result = Arrays.binarySearch(new int[]{1,2,5,7,16},7); // best works with sorted array,
        System.out.println(result);                                                              // if neative index then it does not exist in array
 System.out.println("-----------------------------");

     Integer [] array = new Integer[]{1,2,3,7,16};
     List<Integer> result1 = Arrays.asList(array);
    System.out.println(result1);
 System.out.println("-----------------------------");
        Integer [] array1 = new Integer[]{1,2,3,4,5};
        Integer [] array2 = new Integer[]{1,2,3,4,5};
        System.out.println(Arrays.compare(array1,array2)); // 0 they are same
// with boolean                                                           //
System.out.println(Arrays.equals(array1,array2));

// we can copy the array and give to another array, new copy does not have anything to do with old array

        Integer [] coppiedArray1 = Arrays.copyOf(array1,3);
        System.out.println(Arrays.toString(coppiedArray1));

        //sort array
        Integer [] array5 = new Integer[]{7,2,10,4,5};
        Arrays.sort(array5);
        System.out.println(Arrays.toString(array5));


    }
}

/*
    Create a class User which implements
    comparable.
    FIELDS: firstname, lastname, age, height
    sort by these fields in the same order
 */


/*
     {1,10,7,3,9} size n 0(N)
     {1,3,5,7,10} size (n) 0 (logN)
 */
