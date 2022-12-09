package com.example.javaformpractice.collections;
import java.util.*;

public class Users  implements Comparable<Users>{
    private String name;
    private double balance=0;
    private double spend=0;
    public Users(){
    }
    public Users(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.spend=0;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double getSpend() {
       return spend;
    }
    public void buy(Products products){
            this.balance= this.balance - products.getPrice() ;
            this.spend = spend +products.getPrice();
}

    @Override
    public String toString() {
        return "Name: "+this.name+" Balance: "+this.balance +" Has spend: " +this.spend+ "\n";
    }
    @Override
    public int compareTo(Users users) {
        int compare = 0;

        if(compare == 0 ){
            compare = name.toLowerCase().compareTo(users.getName().toLowerCase());
        }
        if (compare == 0 ) {
            compare = Double.compare(balance, users.getBalance());}
        if (compare == 0 ) {
            compare = Double.compare(spend, users.getSpend());}
        return compare;
    }

    public static void main(String[] args) {
//create users object
        Users user1 = new Users("Ronald", 200);
        Users user2 = new Users("roaald", 100);
        Users user3 = new Users("Arnold", 300);
//adds users in list
        List<Users> myUsers =new ArrayList<>();
        myUsers.add(user1);
        myUsers.add(user2);
        myUsers.add(user3);

System.out.println("______________________ORIGINAL USERS LIST___________________");
//Print out NEW USERS lIST
        System.out.println("Users list: "+myUsers.toString());
//CREATE PRODUCTS LIST
        List<Products> myProducts =new ArrayList<>();
        myProducts.add(new Products("Kiwi",1.0));
        myProducts.add(new Products("Apple",6.0));
        myProducts.add(new Products("Plums",3.0));
        myProducts.add(new Products("Oranges",5.99));
System.out.println("______________________PRODUCTS LIST_________________________");
        System.out.println("Products list: "+myProducts.toString());

System.out.println("______________________After Buying something________________");
// SET USER FROM myUsers LIST TO buy some product from list using index
        myUsers.get(0).buy(myProducts.get(0));
        myUsers.get(0).buy(myProducts.get(1));

        myUsers.get(2).buy(myProducts.get(1));
        myUsers.get(2).buy(myProducts.get(1));
//print out changes on user list, after buying
        System.out.println(myUsers.toString());

     //   System.out.println("User 1 sales "+user1.getSpend());


System.out.println("________________________Sorting_____________________________");
//SORT USERS BY NAME
      //  Collections.sort(myUsers);
//SORT USERS BY BALANCE LOW-HIGH(ASC)
      //  Collections.sort(myUsers,Comparator.comparingDouble(Users::getBalance));
//SORT BY ONE WHO HAS BOUGHT THE MOST

//SORT BY MOST MONEY SPEND HIGH-MIN (DESC)
     //   Collections.reverseOrder(Comparator.comparingDouble(Users::getSpend)); //  alone this line only reverses names NOT SPEND PARAMETERS
        Comparator<Users> reverseUserSpendList= Collections.reverseOrder(Comparator.comparingDouble(Users::getSpend));
        Collections.sort(myUsers,reverseUserSpendList);
//PRINTS OUT SORTED LISTS
        for (Object u : myUsers) {
            System.out.print(u.toString());
        }
    }
}







/*
    Users => name, balance
    Sales => records per user

    get all users sorted by  name
    get all users sorted by  balance ASC
    get all users sorted by most paying DESC
 */