package com.example.javaformpractice.collections;

import javafx.scene.control.Alert;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsClass {

 //   int [] arrayOfIntegers= new int[]{5,4,9,3,4,7} ;
 public static void main(String[] args) {
     int [] arrayOfIntegers= new int[]{5,4,9,3,3,7} ;

    Integer j= 0;


     // sort array
    for (int i = 0; i< arrayOfIntegers.length-1; i++){ //
        if (arrayOfIntegers[i] != arrayOfIntegers[i+1]) {
            arrayOfIntegers[j++] =arrayOfIntegers[i];
        }

    }
     arrayOfIntegers[j++] =arrayOfIntegers [arrayOfIntegers.length-1];

     for (int num: arrayOfIntegers){
            System.out.println(num);
        }
    }
}






// implement a set using an array with any size
// and create method to add item into array
// make array act like a set









//        Set<Integer> numberSet = new HashSet<>();
//       System.out.println(numberSet.isEmpty());
//       numberSet.add(13);
//       numberSet.add(25);
//       numberSet.add(7);
//       numberSet.add(13);
//
//       numberSet.forEach((Integer num) -> System.out.println(num));
      //  numberSet.forEach(System.out::println);

//        for (Integer number: numberSet){
//            System.out.println(number);
//        }


//_____________________________________________________________________________________________


//    // new array
//    String arrayOfStrings[] = { "orange", "apple", "orange","kiwi" };
//// prints our array
//        System.out.println("Array: "+ Arrays.toString(arrayOfStrings));
//
//                // creates new set place array in
//                Set<String> newStringArray= new HashSet<String>(Arrays.asList(arrayOfStrings));
//
////prints new set
//        System.out.println("new HashSet: " + newStringArray);