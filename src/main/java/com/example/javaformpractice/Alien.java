package com.example.javaformpractice;

public class Alien extends Being{
        private boolean hungry=true;
        private  int maxFeedTimes=0;

        public Alien (){
            super();
            this.maxFeedTimes=5;
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
            //    System.out.println("Alien Has been fed " +" Hungry: "+ this.hungry);
        } else if (this.maxFeedTimes == 1) {
            feedThem();
            //     System.out.println(" Alien Has been fed for last time" + "\n" + "Further feeding will lead to wc " + " Hungry: "+this.hungry);

        } else{
            this.hungry = false;
            //     System.out.println("You need to go to potty " + " Hungry: "+this.hungry);
        }
    }

    @Override
    public void relieveTheBeing(){
        this.maxFeedTimes=5;
        this.hungry=true;
        System.out.println("You can eat again :)");
    }

    @Override
    public String toString () {
        String text = "";
        if (maxFeedTimes >= 1) {
            text = "\n" + "____________________________________"+
                   "\n" + "Alien has been fed "
                 + "\n" +" Hungry: " + this.hungry;
        }
        if (maxFeedTimes < 1) {

            text =  "\n" +"____________________________________"+
                    "\n" +"Alien Has been fed for last time! "
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

