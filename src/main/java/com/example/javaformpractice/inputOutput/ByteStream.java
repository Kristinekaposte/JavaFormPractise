package com.example.javaformpractice.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name);


        FileInputStream in=null;
        FileOutputStream out=null;
        try {

             in = new FileInputStream("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt");
             out = new FileOutputStream("src/main/java/com/example/javaformpractice/inputOutput/files/user_output.txt");
     int c;
     // READ FROM INPUT AND WRITE TO OUTPUT
     while ((c=in.read()) != -1){
        out.write(c);
     }

//     String greeting= "hello class !";
//     byte[] byteGreeting = greeting.getBytes();
//     out.write(byteGreeting);

            byte[] byteGreeting = name.getBytes();
            out.write(byteGreeting);

        }catch (IOException e){
            e.printStackTrace();
        } finally { //  once done with everything do this:
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }

    }
}

