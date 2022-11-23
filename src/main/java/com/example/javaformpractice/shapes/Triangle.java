package com.example.javaformpractice.shapes;

public class Triangle extends CorneredShape implements  IShape{
   private double base;
   private double side1;
   private double side2;


    public Triangle(double base, double side1, double side2){
        super (3);
        this.base=base;
        this.side1=side1; // height
        this.side2=side2;
    }
    @Override
    public double getArea(){
        return (side1 * base) /2; // (height * base) / 2
    }


    public static void main (String[]args){
        Triangle myTriangle = new Triangle(15,20,25);
        Circle myCircle = new Circle(10);

     //   IShape myIShape =(Triangle) myTriangle;
     //   IShape myIShape =(IShape) myCircle;
      //  IRound myIRoundShape=(IRound) myTriangle; // cant cast triangle to Iround because triangle does not have relationship
      //  CorneredShape myCorneredShape =(CorneredShape) myTriangle; // casting, possible if 2 types have relatioship like extending etc.


        System.out.println(myTriangle instanceof IRound); // false
        System.out.println(myTriangle instanceof IShape); // true
    }
}


//being (object should be this to create alien or human)
// human (can max feed him 3 times, and then print out he needs to go to wc)
// alien (can feed 5 times)

// Being

// Human
// Alien

// Build interface to create a being as a human or alien and use that to determine how many times this being can be fed
// from the interface. (3 for humans, 5 for aliens)
