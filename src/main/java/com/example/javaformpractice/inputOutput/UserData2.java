//package com.example.javaformpractice.inputOutput;
//
//import java.io.File;
//import java.io.RandomAccessFile;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//
//public class UserData2 {
//    public static void main(String[] args) throws Exception{
//        RandomAccessFile file = new RandomAccessFile("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt", "r");
//        FileChannel fileChannel = file.getChannel();
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(500); //capacity
//        while (fileChannel.read(byteBuffer)>0){
//            byteBuffer.flip();
//            while (byteBuffer.hasRemaining()){ // while we have space in this buffer
//                System.out.println((char) byteBuffer.get());
//            }
//            byteBuffer.clear(); // prepare for new reading when its done
//        }
//        file.close();
//
//
//    }
//
//}










package com.example.javaformpractice.inputOutput;

import java.io.*;

public class UserData2 {
    public static void main(String[] args) {
//        FileReader in = null;
//        FileWriter out = null;
        BufferedReader in=null;
        BufferedWriter out = null;
        try {
         //   in= new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt");
          //  out = new FileWriter("src/main/java/com/example/javaformpractice/inputOutput/files/user_output.txt");
            in=new BufferedReader(new FileReader("src/main/java/com/example/javaformpractice/inputOutput/files/user.txt"));
            out= new BufferedWriter(new FileWriter("src/main/java/com/example/javaformpractice/inputOutput/files/user_output.txt"));

//      int nextChar;
//      while ((nextChar = in.read()) != -1){
//         System.out.println(nextChar);
//          out.append((char)nextChar); // cast int to char
//      }
            String line;
            while ((line= in.readLine()) !=null){
                System.out.println(line);
                out.write(line+ "\n");

            }
        }catch (IOException e){

            e.printStackTrace();
        }finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        throw  new RuntimeException(e);
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            throw  new RuntimeException(e);
                        }}}}}
}
