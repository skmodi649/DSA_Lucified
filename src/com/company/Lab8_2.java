package com.company;

class Thread1 extends Thread {
    private Thread t;

    Thread1() {
        System.out.println("Creating Thread 1");
    }

    public void run() {
        System.out.println("Running Thread 1");
        try {
            int c = 0;
            for (int i = 100; i <= 200; i++) {
                c++;
                int sum = 0;
                int num = i;
                while (num > 0) {
                    int d = num % 10;
                    sum = sum * 10 + d;
                    num = num / 10;
                }
                if (i % sum == 0)
                    System.out.println("Thread 1 : " + i);

                if (c == 10) {
                    c = 0;
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1" + " interrupted.");
        }
        System.out.println("Thread 1" + " exiting.");
    }

    public void start() {
        System.out.println("Starting Thread 1");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

class Thread2 extends Thread{
    private Thread t;
    Thread2() {
        System.out.println("Creating Thread 2");
    }
    public void run() {
        System.out.println("Running Thread 2");
        try {
            int c = 0;
            for (int i = 1; i <= 100; i++) {
                c++;
                int sum = 0;
                int num = i;
                while (num > 0) {
                    int d = num % 10;
                    sum = sum * 10 + d;
                    num = num / 10;
                }
                int count = 0;
                for (int a = 1; a <= i; a++) {
                    if (i % a == 0)
                        count++;
                }
                if (count == 2)
                    System.out.println("Thread 2 : " + i);

                if (c == 10) {
                    c = 0;
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2" + " interrupted.");
        }
        System.out.println("Thread 2" + " exiting.");
    }

    public void start() {
        System.out.println("Starting Thread 2");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}



public class Lab8_2 {
    public static void main(String[] args){
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}
