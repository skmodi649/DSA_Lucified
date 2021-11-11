package com.company;


import java.util.Scanner;
public class Lab9_1{
    String course_name , faculty_name;
    static int numberOfSeats;
    Lab9_1(String course_name , String faculty_name , int numberOfSeats)
    {
        this.course_name = course_name;
        this.faculty_name = faculty_name;
        this.numberOfSeats = numberOfSeats;
    }

    synchronized void Register_Seat()
    {
        if(numberOfSeats<=0){
            try{
                wait();
            }
            catch(Exception e){
            }
        }
        numberOfSeats--;
    }

    synchronized void Allot_Seats(int seats)
    {
        numberOfSeats+=seats;
        notify();
    }

    //Driver Method

    public static void main(String args[])
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        Scanner sc = new Scanner(System.in);
        final Lab9_1 ob = new Lab9_1("Java Programming" , "Hilda" , 0);
        new Thread(){
            @Override
            public void run(){
                ob.Register_Seat();
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                ob.Register_Seat();
            }
        }.start();

        new Thread() {
            @Override
            public void run(){
                ob.Allot_Seats(60);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                System.out.println(numberOfSeats);
            }
        }.start();
    }
}

