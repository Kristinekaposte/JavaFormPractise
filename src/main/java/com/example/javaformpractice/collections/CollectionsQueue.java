package com.example.javaformpractice.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        Deque<String> deque =new LinkedList<>();
        deque.offer("sam");
        deque.offer("jacob");

        System.out.println( deque.peek());//  shows  1th item on list
        System.out.println( deque.poll());// remove 1th item and display to us
        System.out.println( deque.peek());//  shows  1th item on list

    }


// create method to add a black knight into your queue
    // when knight is dead, the knight is removed from
    // queue and next knight is used to play


}

//    public static void main(String[] args) {
//        Queue<String> queue =new LinkedList<>();
//        queue.offer("sam");
//        queue.offer("jacob");
//
//        System.out.println(queue.peek());//  shows  1th item on list
//        System.out.println(queue.poll());// remove 1th item and display to us
//        System.out.println(queue.peek());//  shows  1th item on list
//
//    }

