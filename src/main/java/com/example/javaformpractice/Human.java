package com.example.javaformpractice;

public class Human extends Being{
    private int feed;
    private  int timesFed=0;
    private boolean hungry=true;
    private  int maxFeedTimes=0;

    public Human (){
        super();
        this.maxFeedTimes=3;

    }

    private void feedThem(){
       //  this.feed++;
         this.maxFeedTimes--;
//         if (maxFeedTimes==0){
//             hungry=false;
//         }
    }
@Override
    public void feedTheBeing() {
    if (maxFeedTimes >1) {
        feedThem();
    //    System.out.println("Human Has been fed " +" Hungry: "+ this.hungry);
    } else if (maxFeedTimes == 1) {
            feedThem();
       //     System.out.println("Human Has been fed for last time" + "\n" + "Further feeding will lead to toilet " + " Hungry: "+this.hungry);

        } else{
            this.hungry = false;
       //     System.out.println("You need to go to potty " + " Hungry: "+this.hungry);
        }
    }
@Override
    public String toString () {
        String text = "";
        if (hungry){
            text= "\n" +"Human has been fed " + "\n"+"Is he still hungry ?" + " Hungry: "+this.hungry;
        }if(!hungry){
            text= "\n" +"Cant feed, You need to go to potty first " + "\n"+"Is he still hungry ?" + " Hungry: "+ this.hungry;
        } return text;

    }
    public static void main (String[] args){
        Human human1 = new Human();
        human1.feedTheBeing();
        human1.feedTheBeing();
        human1.feedTheBeing();
       human1.feedTheBeing();
      //  human1.feedTheBeing();
        System.out.println(human1.toString());
    }


}
