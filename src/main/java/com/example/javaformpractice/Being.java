package com.example.javaformpractice;

public class Being implements IBeing {
    private  int timesFed=0;
    private  int maxFeedTimes=0;
    Human human;
   public Being (Human human){
     this.human=human;
    }
    public Being (){

    }
    @Override
    public void feedTheBeing(){

    }

    @Override
    public String toString() {
    return null;
}

    public static void main (String[] args){
      Being being = new Being(new Human());
        being.human.feedTheBeing();
        being.human.feedTheBeing();
        being.human.feedTheBeing();
        being.human.feedTheBeing();
        System.out.println(being.human.toString());

    //  System.out.println(being.human.toString());
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