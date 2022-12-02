package com.example.javaformpractice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class BlackKnight implements Comparable<BlackKnight> { //implements InterfaceBlackKnight

    private byte arms = 2;
    private byte legs = 2;
    private byte head = 1;
    private String name;
    private Boolean alive = true;
    private String warning;
    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    // public static BlackKnight[] allKnights = new BlackKnight[10]; // can contain 10 players
    public static Queue<BlackKnight> allKnights = new LinkedList<>();
    //constructor overload

    public BlackKnight() {
        this.name = "Anonymous knight";
    }
    //constructor

    public BlackKnight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public byte getArms() {
        return arms;
    }

    public byte getHead() {
        return head;
    }

    public byte getLegs() {
        return legs;
    }

    public Boolean getAlive() {
        return alive;
    }

 //   @Override

    public void cutOffArm() {
        arms--;
    }

//    @Override
    public void cutoffLeg() {
        legs--;
    }

 //   @Override

    public void cutOffHead() {
        head--;
    }

  //  @Override
    public void strike() {
        if (alive) {
            if (arms > 0) {
                cutOffArm();
            } else if (legs > 0) {
                cutoffLeg();
            } else {
                cutOffHead();
                alive = !alive;
            }

        } else {
            this.warning = "Stop! " + this.name + " is already dead";
            // System.out.println("Stop! "+ this.name+" is already dead");
            System.out.println(warning);
          //  allKnights.poll();
        }
    }

    @Override
    public String toString() {
        String text = "";
        if (alive) {
            text = "\n" + "Name: " + this.name + "\n" + "Arms: " + this.arms + "\n" + "Legs: " +
                    this.legs + "\n" + "Head: " + this.head + "\n" + "Currently alive?:  " + this.alive;
        }
        if (!alive) {
            text = "\n" + "Name: " + this.name + "\n" + "Arms: " + this.arms + "\n" + "Legs: " +
                    this.legs + "\n" + "Head: " + this.head + "\n" + "Currently alive?:  " + this.alive + " " + this.warning;  //  returns text with warning if knight is already dead
        }
        return text;
    }

//    public static void thisWillShowException() {
//        DeadKnightException exception = new DeadKnightException("he is dead");
//        throw exception;
//    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true; // check for self
        if (o == null || getClass() != o.getClass()) return false;   // if object is null or if they dont have same class return false
        BlackKnight knight = (BlackKnight) o;

        return (arms == knight.getArms() &&
                legs == knight.getLegs() &&
                head == knight.getHead() &&
                alive == knight.getAlive()&&
                name.equals(knight.getName()));

    }

@Override
public int hashCode(){ //  we should get nr. back
        int result = 31 * name.hashCode()+
                 ((Byte) arms).hashCode()+
                 ((Byte) legs).hashCode()+
                 ((Byte) head).hashCode()+
                 ((Boolean) alive).hashCode();
        return result;
}
@Override
public int compareTo (BlackKnight knight){
        return this.name.charAt(0) - knight.getName().charAt(0);
}

    public static void main(String[] args) {
        BlackKnight blackKnight = new BlackKnight("joe");
        allKnights.add(blackKnight);
        System.out.println(allKnights);
        blackKnight.strike();
        blackKnight.strike();
        blackKnight.strike();
        blackKnight.strike();
        blackKnight.strike();
        blackKnight.strike();
        blackKnight.strike();

        System.out.println(blackKnight.toString());

    }
}







//    public static void main (String[] args) throws DeadKnightException {
//        BlackKnight knight1 = new BlackKnight("Arthur");
//        allKnights[0]=knight1; // set 1th knight in array be arthur
//        BlackKnight.numOfAliveKnights++; // increase nr. of alive knights
//        try {
//            allKnights[0].strike();
//            System.out.println("try block");
//
//
//        }catch (DeadKnightException e){
//            e.printStackTrace();
//            System.out.println("CATCHED HERE");
//        } finally {
//            System.out.println("OPERATION COMPLETED");
//        }
//
////        allKnights[0].strike();
////        allKnights[0].strike();
////        allKnights[0].strike();
////        allKnights[0].strike(); // alive false
////        allKnights[0].strike(); // next strike will say to stop, because he is already dead
//
//        System.out.println(allKnights[0].toString());
//
//
//// from constructor overload
////            BlackKnight knight2 = new BlackKnight();
////            System.out.println(knight2.toString());
//    }
//}


