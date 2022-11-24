package com.example.javaformpractice;

public class Human extends Being{
    private boolean hungry=true;
    private int maxFeedTimes=0;

    public Human (){
        super();
        this.maxFeedTimes=3;
    }
    private void feedThem(){
         this.maxFeedTimes--;
    }
   public boolean isHungry(){
        return this.hungry;
    }
@Override
    public void feedTheBeing() {
    if (this.maxFeedTimes >1) {
        feedThem();
    //    System.out.println("Human Has been fed " +" Hungry: "+ this.hungry);
    } else if (this.maxFeedTimes == 1) {
            feedThem();
       //     System.out.println("Human Has been fed for last time" + "\n" + "Further feeding will lead to toilet " + " Hungry: "+this.hungry);

        } else{
            this.hungry = false;

       //     System.out.println("You need to go to potty " + " Hungry: "+this.hungry);
        }
    }
@Override
    public void relieveTheBeing(){
            this.maxFeedTimes=3;
            this.hungry=true;
            System.out.println("You can eat again :)");
        }



    @Override
    public String toString () {
        String text = "";
        if (maxFeedTimes >= 1) {
            text = "\n" + "____________________________________"+
                    "\n" + "Human has been fed "
                    + "\n" +" Hungry: " + this.hungry;

        }
        if (maxFeedTimes < 1) {

            text =  "\n" +"____________________________________"+
                    "\n" +"Human Has been fed for last time! "
                    + "\n" + "Further feeding will lead to WC"
                    +"\n" + "Hungry: " + this.hungry;

        }
        if (!hungry) {
            text ="\n" +"____________________________________"+
                    "\n" + "Cant feed, You need to go to potty first "
                    + "\n" + "Hungry ? " + this.hungry;


        }
        return text;

    }
    public static void main (String[] args){
        Human human1 = new Human();
        human1.feedTheBeing();
        System.out.println("1th fed"+human1.toString());
    System.out.println("********************************************************");

        human1.feedTheBeing();
        System.out.println(("2th fed"+human1.toString()));
        System.out.println("********************************************************");

        human1.feedTheBeing();
        System.out.println(("3th fed"+human1.toString()));
        System.out.println("********************************************************");

        human1.feedTheBeing();
        System.out.println(("4th fed"+human1.toString()));
        System.out.println("********************************************************");

        human1.relieveTheBeing();
        System.out.println(("1th relief"+human1.toString()));
        System.out.println("********************************************************");




        human1.feedTheBeing();
        System.out.println("fed after relief"+human1.toString());
        System.out.println("********************************************************");
        human1.feedTheBeing();
        human1.feedTheBeing();
      //  human1.feedTheBeing();
      // human1.feedTheBeing();
        System.out.println(human1.toString());
    }


}
