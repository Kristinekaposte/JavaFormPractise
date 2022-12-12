package com.example.javaformpractice.inputOutput;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


    public class Homework1 {

        public static void main(String[] args) {
          LineNumberReader lineNumberReader = null;
          FileReader fileReader = null;
          List<String> myArrayList = new ArrayList<>();
          int lineWeNeed=2;


          try {
            fileReader= new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt");
            lineNumberReader =new LineNumberReader(fileReader);
              String line = "";
              int lineIndex=1;
              boolean found= false;


                  while ((line = lineNumberReader.readLine()) != null) {
                  //PRINTS OUT ALL LINES
                     // int lineNumber = lineNumberReader.getLineNumber();
                       //  System.out.println(lineNumber+ " "+ line);
                  //FIND LINE WE NEED
//                      if(lineIndex == lineWeNeed){
//                          System.out.println(lineIndex +" " + line);
//                          found=true;
//                          break;
//                      }lineIndex++;

            //MAKES WORDS INTO ARRAY
                      String word = line;
                      String[] arrStr= word.split(" ");
                      for (String a : arrStr)
                          myArrayList.add(a);


                   //   myArrayList.add(line);
                  }
                  System.out.println(Arrays.toString(myArrayList.toArray()));
//                  if(!found){
//                      System.out.println("Did not found your line");
//                  }






            } catch (IOException e){

            e.printStackTrace();
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw  new RuntimeException(e);
                }
                    }}
        }
    }
/*
Write a Java program to store text file content line by line into an array

Write a program that accepts line number
and word position as input and returns the correct word in a file input
 */
