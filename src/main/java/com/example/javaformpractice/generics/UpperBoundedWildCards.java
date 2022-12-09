package com.example.javaformpractice.generics;

import java.util.List;

public class UpperBoundedWildCards {

    public static double sum(final List<? extends Number> numbers){ //  extends replace with super and its lowerBound
      double sum=0;
      for (Number number: numbers){
         sum += number.doubleValue();
      }

      return  sum;
    }
    public static void addNumbers(List<? super Integer>list){ // list of anything og Integer or higher, lowerbound
        for (int i=1; i<=10; i++){
            list.add(i);
        }
    }


    public static void main(String[] args) {
        List<Integer> values = List.of(1,2,3,4);
        System.out.println(sum(values));

     //   List<Integer> myList = List.of(1,2,3);
        addNumbers(List.of(1,2,3));
        addNumbers(List.of(new Object(),new Object()));

//        for (Integer num: myList){
//            System.out.println(num);
//        }

    }
}
