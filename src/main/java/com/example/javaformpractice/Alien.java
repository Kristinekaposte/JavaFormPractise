package com.example.javaformpractice;

public class Alien extends Being{
        private int feed;
        private  int timesFed=0;
        private boolean hungry=true;
        private  int maxFeedTimes=0;

        public Alien (){
            super();
            this.maxFeedTimes=5;
        }

    private void feedThem(){
        //  this.feed++;
        this.maxFeedTimes--;
//         if (maxFeedTimes==0){
//             hungry=false;
//         }
    }
    boolean isHungry(){
            return this.hungry;
    }
    @Override
    public void feedTheBeing() {
        if (maxFeedTimes >1) {
            feedThem();
            //    System.out.println("Alien Has been fed " +" Hungry: "+ this.hungry);
        } else if (maxFeedTimes == 1) {
            feedThem();
            //     System.out.println(" Alien Has been fed for last time" + "\n" + "Further feeding will lead to toilet " + " Hungry: "+this.hungry);

        } else{
            this.hungry = false;
            //     System.out.println("You need to go to potty " + " Hungry: "+this.hungry);
        }
    }


    @Override
    public String toString () {
        String text = "";
        if (maxFeedTimes >= 1) {
            text = "\n" + "____________________________________"+
                   "\n" + "Alien has been fed "
                 + "\n" +" Hungry: " + this.hungry;
            //     + "\n" +"____________________________________";
        }
        if (maxFeedTimes < 1) {

            text =  "\n" +"____________________________________"+
                    "\n" +"Alien Has been fed for last time! "
                  + "\n" + "Further feeding will lead to WC"
                   +"\n" + "Hungry: " + this.hungry;
                //  + "\n" +"____________________________________";
        }
        if (!hungry) {
            text ="\n" +"____________________________________"+
                  "\n" + "Cant feed, You need to go to potty first "
                + "\n" + "Hungry ? " + this.hungry;
             //   + "\n" +"____________________________________";

        }
        return text;

    }
        public static void main (String[] args){
            Alien alien1 = new Alien();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            System.out.println(alien1.toString());
        }

    }

