package com.example.javaformpractice.collections;

import java.util.HashMap;
import java.util.Map;

public class GenericMapExample <K, V>{ //hashmap
    private class Entry <K,V>{
        private K key;
        private V value;
        private Entry <K,V> next;  // for put method, will point for another entry

 //create Entries for map
        public Entry (K key, V value){
            this.key=key;
            this.value=value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

   private Entry<K, V> table[];  // create array of entries, so we can make map using constructor

    public GenericMapExample(){  // constructor to call map
        table = new Entry[5];
    }
    public void put(K key, V value){ // we want to put entries inside, those accents key and value, method does not return anything
        int hash=key.hashCode() % table.length; // modulus will be as size reminder ? 0-4
        Entry <K,V> e =table[hash]; // just gonna use to get what's inside that arrays place

        if (e == null){ // if array entry is null then it will put entry there
            table[hash] = new Entry<K,V>(key, value);
        }else { // if there is already data there and keys are the same, then we update value
            while (e.next != null){ //while entry is not null
                if(e.getKey() == key){ //if keys are the same
                   e.setValue(value);// we set new value
                   return;
                }
                e=e.next;// if it's not the case we will advance the e.
            }
      //then again if keys match then replace value
        if(e.getKey() == key){
            e.setValue(value);
            return;
        }
            e.next = new Entry<K,V>(key, value); // if key does not exist - add key  in end of the list
        }
    }

    public V get(K key){   //method to return value by passing in key
        int hash=key.hashCode() % table.length; // computing the hash and the value at the table
        Entry <K,V> e =table[hash];

        if(e==null){      // we return null if there is no key  entry
            return  null;
        }
        while ( e != null){ //  while the e is not equal to null
           if (e.getKey() == key){ // if e.getKey() is equal the key we are looking for
              return e.getValue(); // the we just return its value
           }
           e = e.next; // otherwise we more forward
        }
        return null; //  if key does not exist return null
    }

    public static void main(String[] args) {
        GenericMapExample<Integer, String> mymap =new GenericMapExample<>();
        mymap.put(0,"Arthur");
      //  mymap.put(1,"Arthur2");
        mymap.put(1,"john");

      System.out.println( mymap.get(0));

    }


}



/*
create your implementation of generic map
==>put, get
we don't use actual map
 */

//  Create your own implementation of a generic map ==> put, get
// Pair<String, Integer> = new Pair<>();