package com.example.javaformpractice.collections;

import com.example.javaformpractice.BlackKnight;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsMaps {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"joe"); // puts entry name in key value 1
        map.put(2,"james");
        map.put(3,"joe");
        map.put(4,"joe");

     //   map.remove(2);

       Integer one=1;
       Integer otherOne=1;

                       // System.out.println(one.equals(otherOne));
                      //  System.out.println(one.hashCode() == otherOne.hashCode());
                     //  System.out.println(one == otherOne);
        BlackKnight knight1 = new BlackKnight("sam");
        BlackKnight knight2 = new BlackKnight("sam");

//        System.out.println(knight1.equals(knight2)); /// we created method to compare them
//
//        List<BlackKnight> knights = Arrays.asList(knight1,knight2);
//        System.out.println(knights.contains(new BlackKnight("sam")));


Set<BlackKnight> knightSet = new HashSet<>(); //  we overrided hascode for true
knightSet.add(knight1);
knightSet.add(knight2);
System.out.println(knightSet.contains(new BlackKnight("sam")));



 System.out.println("______________________________________________________");

//count number of knights named a certain name, using maps
        int count = Collections.frequency(map.values(),"joe");
        System.out.println("Name appears "+ count+ " times");

      //  System.out.println(map.size());
      //  System.out.println(  map.containsKey(2));
      // System.out.println(map.get(2));


//        for(Map.Entry<Integer, String> entry :map.entrySet()){ // returns entries one by one
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }

  //PUTS ARRAY VALUES INTO MAP
 System.out.println("______________________________________________________");
        String[] myArray ={"key1","key2", "key3"};
        String[] myArray1 ={"black","red", "red"};
        Map <String, String> myMap = new HashMap<>();

        for (int i=0; i< myArray1.length;i++){

            myMap.put(myArray[i],myArray1[i]);
        }
        System.out.println(myMap);

        int count1 = Collections.frequency(myMap.values(),"red");
        System.out.println("word appears "+count1 + " times");

    }
}
