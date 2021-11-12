package com.company;

import java.io.*;

class threadA extends Thread
{
    private Thread t;
    threadA() {
        System.out.println("Creating Thread 1");
    }

    public void run() {
        System.out.println("Running Thread 1");
        try {
            File myObj = new File("file1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            //Now writing in the text file created
            FileWriter printWriter = new FileWriter("file1.txt");
            for (int i = 1; i <= 100; i++) {
                int c = 0;
                for (int a = 1; a <= i; a++) {
                    if (i % a == 0)
                        c++;
                }
                if (c == 2)
                    printWriter.write(i);
            }
            printWriter.close();
        }
            catch (IOException e){
            System.out.println("Thread 1" + " interrupted.");
            System.out.println("Thread 1" + " exiting.");
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


class threadB extends Thread{
    private Thread t;
    threadB() {
        System.out.println("Creating Thread 2");
    }

    public void run() {
        System.out.println("Running Thread 2");
        try {
            File myObj = new File("file2.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            //Now writing in the text file created
            FileWriter printWriter = new FileWriter("file2.txt");
            for (int i = 101; i <= 200; i++) {
                int c = 0;
                for (int a = 1; a <= i; a++) {
                    if (i % a == 0)
                        c++;
                }
                if (c == 2)
                    printWriter.write(i);

            }
            printWriter.close();
        }
        catch (IOException  e){
            System.out.println("Thread 1" + " interrupted.");
            System.out.println("Thread 1" + " exiting.");
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

class threadC extends Thread{
    private Thread t;
    threadC() {
        System.out.println("Creating Thread 3");
    }

    public void run() {
        System.out.println("Running Thread 3");
        try {
            //Now reading the contents of the file from the console
            FileInputStream fstream = new

                    FileInputStream("file1.txt");

            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            //Read File Line By Line

            while ((strLine = br.readLine()) != null) {

                // Print the content on the console

                System.out.println(strLine);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void start()
    {
        System.out.println("Starting Thread 3");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}


class threadD extends Thread{
    private Thread t;
    threadD() {
        System.out.println("Creating Thread 4");
    }

    public void run() {
        System.out.println("Running Thread 4");
        try {
            //Now reading the contents of the file from the console
            FileInputStream fstream = new

                    FileInputStream("file2.txt");

            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            //Read File Line By Line

            while ((strLine = br.readLine()) != null) {

                // Print the content on the console

                System.out.println(strLine);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void start()
    {
        System.out.println("Starting Thread 4");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}



public class Lab9_5 {
    public static void main(String[] args) {

        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");

        threadA t1 = new threadA();
        t1.start();
        threadB t2 = new threadB();
        t2.start();
        threadC t3 = new threadC();
        t3.start();
        threadD t4 = new threadD();
        t4.start();
    }
}
