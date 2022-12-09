package com.example.javaformpractice.generics;

public class Generics2 <T> {

private T thingX;
    public Generics2() {
    }
     public Generics2(T thingX) {
         this.thingX = thingX;
     }
        public T getThingX() {
            return thingX;
     }





    public static void main(String[] args) {
        Generics2 <String> myGenerics2 = new Generics2("hello");
        myGenerics2.getThingX();
     //   Generics2 <String> myAdmin =new Admin("hey");

    }

}


/*
    Create a generic for a website user which accepts
    3 different types of users (Admin, Customer, SuperAdmin)
 */
