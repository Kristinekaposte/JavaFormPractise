package com.example.javaformpractice.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C1 {
    static final int ROWS=5;
    static final int COLLUMS=2;
   static LineNumberReader lineNumberReader = null;
   static FileReader fileReader = null;
        public static void main(String[] args) throws IOException {
            readFile();
        }

        public static void readFile() throws IOException{
            String line = "";
            String [][] stringArray = new String[ROWS][COLLUMS];
            fileReader= new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt");
            lineNumberReader =new LineNumberReader(fileReader);
            while ((line = lineNumberReader.readLine()) != null) {
                for(int i=0; i<stringArray.length; i++){
                    String []lines=line.trim().split(" " + " ");
                    for(int j = 0; j<lines.length; j++){
                        stringArray[i][j] = lines[j];
                    }
                }
            }
            System.out.println(Arrays.deepToString(stringArray));
        }
    }
/*
Write a program that accepts line number
and word position as input and returns the correct word in a file input
 */

