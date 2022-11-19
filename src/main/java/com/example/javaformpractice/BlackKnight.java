package com.example.javaformpractice;

public class BlackKnight  implements InterfaceBlackKnight{

    private byte arms=2;
    private byte legs=2;
    private byte head=1;
    private String name;
    private Boolean alive=true;
    private String warning;
    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    public static BlackKnight[] allKnights = new BlackKnight[10]; // can contain 10 players

    //constructor overload

    public BlackKnight(){
        this.name ="Anonymous knight";
    }
    //constructor

    public BlackKnight(String name){
        this.name=name;
    }
    @Override

    public void cutOffArm() {
        arms--;
    }

    @Override
    public void cutoffLeg(){
        legs--;
    }
    @Override

    public void  cutOffHead() {
        head--;
    }
    @Override
    public void strike() {
        if (alive) {
            if(arms >0){
                cutOffArm();
            } else if (legs>0) {
                cutoffLeg();
            }  else  {
                cutOffHead();
                alive = !alive;
            }

        } else{
             this.warning = "Stop! "+ this.name+" is already dead";
           // System.out.println("Stop! "+ this.name+" is already dead");
            System.out.println(warning);
        }
    }

    @Override
    public String toString () {
        String text = "";
        //System.out.println( "name: " + this.name + ", arms: " +arms+", legs: "+legs+", head: "+head);
               if (alive){
            text= "\n" +"Name: " + this.name +"\n" +"Arms: " + this.arms+"\n"+ "Legs: " +
                            this.legs +"\n"+"Head: " + this.head+ "\n"+"Currently alive?:  " +this.alive;
                }if(!alive){
            text= "\n" +"Name: " + this.name +"\n" +"Arms: " + this.arms+"\n"+ "Legs: " +
                    this.legs +"\n"+"Head: " + this.head+ "\n"+"Currently alive?:  " +this.alive+" "+ this.warning ;  //  returns text with warning if knight is already dead
        } return text;
    //    return "\n" +"Name: " + this.name +"\n" +"Arms: " + this.arms+"\n"+ "Legs: " + this.legs +"\n"+"Head: " + this.head+ "\n"+"Currently alive?:  " +this.alive;



//        return "BlackKnights { " + "\n"+
//                "name: " +this.name +"\n"+
//                ", arms: " + this.arms +"\n"+
//                ", legs: " + this.legs +"\n"+
//                ", head: " + this.head+"\n"+
//                "alive " +this.alive+
//                " }";

    }

    public static void main (String[] args){
        BlackKnight knight1 = new BlackKnight("Arthur");
        allKnights[0]=knight1; // set 1th knight in array be arthur
        BlackKnight.numOfAliveKnights++; // increase nr. of alive knights
        allKnights[0].strike();
        allKnights[0].strike();
        allKnights[0].strike();
        allKnights[0].strike();
        allKnights[0].strike(); // alive false
        allKnights[0].strike(); // next strike will say to stop, because he is already dead

        System.out.println(allKnights[0].toString());


// from constructor overload
//            BlackKnight knight2 = new BlackKnight();
//            System.out.println(knight2.toString());
    }

}



//class "BlackKnight"
//      fields==> arms, legs, head, alive, name
//     actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()

