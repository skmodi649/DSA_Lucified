package com.company;

// Java program to read content from file
// using FileInputStream

import java.io.*;


public class Lab9_3 {
    public static void main(String args[]) {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        try{

            FileInputStream fstream = new

            FileInputStream("filename.txt");

            // Get the object of DataInputStream

            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            //Read File Line By Line

            while ((strLine = br.readLine()) != null)   {

                // Print the content on the console

                System.out.println (strLine);



                //System.out.println("File Reversed is" +strLine.reverse);


            }
            in.close();

        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());

        }

    }
}
