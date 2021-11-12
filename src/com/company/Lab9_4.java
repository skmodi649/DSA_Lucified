package com.company;

import java.io.*;

public class Lab9_4 {
    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        try {
            File myObj = new File("Alphabet.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            //Now writing in the text file created
            FileWriter printWriter = new FileWriter("Alphabet.txt");
            printWriter.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            printWriter.close();

            //Now reading the contents of the file from the console
            FileInputStream fstream = new

                    FileInputStream("alphabet.txt");

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
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
