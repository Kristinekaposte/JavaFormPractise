package com.example.javaformpractice.inputOutput;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class InOutPaths {
    public static void main(String[] args)throws IOException {
        BufferedReader reader =null;
        BufferedWriter writer=null;
        try {


        reader = new BufferedReader(new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/example.txt"));
        writer = new BufferedWriter(new FileWriter("src/main/java/com/example/javaformpractice/inputOutput/files/example_out.txt"));


        ArrayList<String> myArrayList = new ArrayList<>();

        String currentLine = reader.readLine();
        while (currentLine != null){
            String word []= currentLine.split(" ");
            for (String a : word)
                myArrayList.add(a);
            currentLine =reader.readLine();
        }

        //Sorting the ArrayList
        Collections.sort(myArrayList);
        //Writing sorted lines into output file

        for (String line : myArrayList) {
            writer.write(line + System.lineSeparator());
           // System.out.println(line);
        }

            Path p1In = Paths.get("src/main/java/com/example/javaformpractice/inputOutput/files/example_out.txt");
            Path p2Out = Paths.get("src/main/java/com/example/javaformpractice/inputOutput/example_out.txt");

          Files.copy(p1In, p2Out,StandardCopyOption.REPLACE_EXISTING, COPY_ATTRIBUTES);








// Files.copy(p1In,p2Out,StandardCopyOption.COPY_ATTRIBUTES, REPLACE_EXISTING);


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw  new RuntimeException(e);
                }
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        throw  new RuntimeException(e);
                    }
            }}
        }

    }
}






        //   Files.copy(p1,p2,REPLACE_EXISTING); // COPIES EXISTING FILE







//        System.out.println(Files.isExecutable(p1));
//        System.out.println(Files.isReadable(p1));
//        System.out.println(Files.isWritable(p1));
//  Path p2 = Paths.get(URI.create());
        //  Path P3 = Path.of("/src", );
        //   Files.move(p1,p2,REPLACE_EXISTING); // moves files


/*
    Create a program that takes a file at one location,
    sorts the words and saves the sorted words in another file in a different location
 */
