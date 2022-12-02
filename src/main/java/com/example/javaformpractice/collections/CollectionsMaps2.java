package com.example.javaformpractice.collections;

import com.example.javaformpractice.BlackKnight;

import java.util.*;

public class CollectionsMaps2 {
    public static void main(String[] args) {
        List<BlackKnight> knightSet = new ArrayList<>();
        BlackKnight knight1 = new BlackKnight("sam");
        BlackKnight knight2 = new BlackKnight("jon");
        BlackKnight knight3 = new BlackKnight("andrew");
        knightSet.add(knight1);
        knightSet.add(knight2);
        knightSet.add(knight3);
        Collections.sort(knightSet);
        System.out.println(knight1.compareTo(knight3));

//        Collections.sort(knightSet, new Comparator<BlackKnight>(){
//            //implemetation here writes
//            @Override
//            public int compare(BlackKnight k1,BlackKnight k2){
//                return (int)k1.getName().charAt(0) - (int)k2.getName().charAt(0);
//            }
//
//        });

        for (BlackKnight knight: knightSet){
            System.out.println(knight.getName());
        }



 //_________________________________________________________________________
     //   Map<BlackKnight, String> map = new HashMap<>();
//        BlackKnight knight1 = new BlackKnight("sam");
//        BlackKnight knight2 = new BlackKnight("jon");
//        BlackKnight knight3 = new BlackKnight("andrew");

//        map.put(knight1, knight1.getName());
//        map.put(knight2, knight2.getName());
//        map.put(knight3, knight3.getName());

//        System.out.println(map.containsKey(new BlackKnight("sam")));
//       System.out.println();
//________________________________________________________________________
//       Integer x=3;
//       System.out.println(x.compareTo(2));
//        System.out.println(x.compareTo(3));
//        System.out.println(x.compareTo(30));
 //________________________________________________________________________
//        Comparator<Integer> integerComparator = Comparator.naturalOrder();
//        System.out.println(integerComparator.compare(3,2));
//        System.out.println(integerComparator.compare(3,3));
//        System.out.println(integerComparator.compare(3,4));
    }

    //COMPARATOR ==>compare(obj 1, obj2)
    //COMPARABLE ==> compareTo(obj);
    // both returns integer value

    //A.compareTo(B);
  //  if value >0 {..B,A...} // B COMES BEFORE A
    //IF VALUE ==0 {...,A,B,...}  EQUAL STAYS THE SAME
    // IF <0 {..A,B...}
   // ________________________________________________
    //compare(A,B);
    //if value >0 {...,B,A,..}
    //IF VALUE ==0 {...,A,B,..}
    //IF <0   {...,A,B,..}
}

//write a compare method implementation to compare knights by name
//checking the next character if current characters are equal.
//should also not be case-sensitive

