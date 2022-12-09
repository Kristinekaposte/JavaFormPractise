//package com.example.javaformpractice.inputOutput;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class UserData {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Enter Name: ");
//                String name = scanner.nextLine();
//             //   System.out.println("Name: " + name);
//
//                System.out.println("Enter Age: ");
//                String age = scanner.nextLine();
//              //  System.out.println("Age: " + age);
//
//                System.out.println("Enter Gender:");
//                String gender = scanner.nextLine();
//              //  System.out.println("Gender: " + gender);
//
//
//            FileInputStream in=null;
//            FileOutputStream out=null;
//            try {
//        in = new FileInputStream("src/main/java/com/example/javaformpractice/inputOutput/files/userData.txt");
//        out = new FileOutputStream("src/main/java/com/example/javaformpractice/inputOutput/files/userData_Output.txt");
//
//                int c;
//                // READ FROM INPUT AND WRITE TO OUTPUT
//                while ((c=in.read()) != -1){
//                    out.write(c);
//                }
//
//        String titleInput = "User BIO "+'\n';
//                byte[] byteTitle = titleInput.getBytes();
//                out.write(byteTitle);
//
//        String nameInput = "Name ";
//
//                byte[] byteNameInput = nameInput.getBytes();
//                out.write(byteNameInput);
//                byte[] byteName = name.getBytes();
//                out.write(byteName);
//
//        String ageInput = '\n' + "Age ";
//
//                byte[] byteAgeInput = ageInput.getBytes();
//                out.write(byteAgeInput);
//                byte[] byteAge = age.getBytes();
//                out.write(byteAge);
//
//        String genderInput = '\n' +"Gender ";
//
//                byte[] byteGenderInput = genderInput.getBytes();
//                out.write(byteGenderInput);
//                byte[] byteGender = gender.getBytes();
//                out.write(byteGender);
//
//
//  scanner.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            } finally { //  once done with everything do this:
//                if (in != null) {
//                    try {
//                        in.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    if (out != null) {
//                        try {
//                            out.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }}}
//
//
///*
//    name
//    age
//    gender
//    profession
// */
///*
//USER BIODATA
//=================================
//NAME: {name}
////
////
//userData.txt
// */