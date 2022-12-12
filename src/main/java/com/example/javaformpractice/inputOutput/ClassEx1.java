package com.example.javaformpractice.inputOutput;

import java.io.*;

public class ClassEx1 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt"));
            out = new BufferedWriter(new FileWriter("src/main/java/com/example/javaformpractice/inputOutput/files/user_output.txt"));

            String longestWord = "";
            String line;
            String shortestWord=longestWord;

            while ((line = in.readLine()) != null) {
                  System.out.println(line);
                out.write(line + "\n");
                //  line = in.readLine();

            }
//                if (line.length() > longestWord.length()) {
//                    longestWord = line;
//                }
//                if(line.length()<shortestWord.length()){
//                    shortestWord =line;
//                  //  System.out.println(shortestWord);
//                }
//            }
//            System.out.println("longest word: " + longestWord);
//            System.out.println("shortest word: " + shortestWord);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }


}

/*
    CLASS EXERCISE
    Write a program to find the longest and shortest word in a file;
 */
