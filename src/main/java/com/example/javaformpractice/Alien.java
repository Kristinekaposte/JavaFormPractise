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
            this.feed++;
            this.maxFeedTimes--;
            if (maxFeedTimes==0){
                hungry=false;
            }
        }
@Override
        public void feedTheBeing(){
            if (hungry){
                System.out.println("Alien Has been fed");
                feedThem();
            }else {
                System.out.println("you need to go to potty");
            }

        }
        public static void main (String[] args){
            Alien alien1 = new Alien();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
            alien1.feedTheBeing();
        }

    }

