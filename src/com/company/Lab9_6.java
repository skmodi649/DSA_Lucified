package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class thread_1 extends Thread{
    private Thread t;
    thread_1()
    {
        System.out.println("Creating Thread 1");
    }
    public void run()
    {
        try{
            File myObj = new File("FileA.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter fileWriter = new FileWriter("FileA.txt");
            fileWriter.write("JAVA is the best programming lanuage!");
            fileWriter.write("It has libraries for all the purposes");

            //creating File instance to reference text file in Java
            File text = new File("FileA.txt");

            //Creating Scanner instance to read File in Java
            Scanner scnr = new Scanner(text);

            //Reading each line of the file using Scanner class
            int lineNumber = 1;
            int count = 0;
            while(scnr.hasNextLine()){
                String line = scnr.nextLine();

                for(int i = 0 ; i < line.length() ; i++)
                {
                    int a_ind = line.indexOf("a");
                    int an_ind = line.indexOf("and");
                    int the_ind = line.indexOf("the");
                    if(a_ind >=0 || an_ind >= 0 || the_ind >= 0)
                        count++;
                }
                lineNumber++;
            }
            System.out.println(count);

        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Starting Thread 1");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}



class thread_2 extends Thread{
    private Thread t;
    thread_2()
    {
        System.out.println("Creating Thread 1");
    }
    public void run() {
        try {
            File myObj = new File("FileB.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter fileWriter = new FileWriter("FileB.txt");
            fileWriter.write("C++ is the best programming lanuage for Competitive Programming");
            fileWriter.write("It has libraries for all the purposes");

            //creating File instance to reference text file in Java
            File text = new File("FileB.txt");

            //Creating Scanner instance to read File in Java
            Scanner scnr = new Scanner(text);

            //Reading each line of the file using Scanner class
            int lineNumber = 1;
            int count = 0;
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                String[] words = line.split("\\s");//splits the string based on whitespace
                for (int i = 0; i < words.length; i++) {
                    if (words[i] != "a" && words[i] != "and" && words[i] != "the") {
                        char ch = words[i].charAt(0);
                        if (ch == 'H' || ch == 'h')
                            count++;
                    }
                }
                lineNumber++;
            }
            System.out.println(count);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

        public void start() {
        System.out.println("Starting Thread 2");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
    }

class thread_3 extends Thread{
    private Thread t;

    thread_3()
    {
        System.out.println("Creating Thread 3");
    }

    public void run()
    {
        System.out.println("Thank you");
    }
    public void start() {
        System.out.println("Starting Thread 3");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}


public class Lab9_6 {
    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");

        thread_1 t1 = new thread_1();
        t1.start();
        thread_2 t2 = new thread_2();
        t2.start();
        thread_3 t3 = new thread_3();
        t3.start();
    }
}
