package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

class Book
{
    String name;
    String author;
    String type;
    int price;
    Book(String name , String author , String type , int price)
    {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int n = sc.nextInt();

        Book[] arr = new Book[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("******* Book "+(i+1)+" **********");
            System.out.println("Enter the name , author , type and price of the book respectively : ");
            String name = sc.next();
            name = name + sc.nextLine();
            String author = sc.next();
            author = author + sc.nextLine();
            String type = sc.next();
            int price = sc.nextInt();
            arr[i] = new Book(name , author , type , price);
        }
        ArrayList<Book>  fiction = new ArrayList<>();
        ArrayList<Book>  comic = new ArrayList<>();
        ArrayList<Book>  cooking = new ArrayList<>();

        for(int i = 0 ;i < n ; i++)
        {
            if(Objects.equals(arr[i].type, "comic"))
                comic.add(arr[i]);
            if(Objects.equals(arr[i].type, "fiction"))
                fiction.add(arr[i]);
            if(Objects.equals(arr[i].type, "cooking"))
                cooking.add(arr[i]);
        }

        System.out.println("*************List of Comic type books**************");
        for (Book book : comic) {
            int max = 0 , min = 0;
            System.out.println(book);
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0 ; i < comic.size() ; i++) {
                list.add(book.name);
                int val = book.price;
                if(val > max)
                    max = val;
                if(val < min)
                    min = val;
            }
        Collections.sort(list);
            System.out.println("***********List of Comic books in ascending order***********");
            for(int i = 0 ; i < comic.size() ; i++)
                System.out.print(list.get(i)+" ");
            System.out.println();
            System.out.print("Maximum price Comic Book : "+max);
            System.out.print("Minimum price Comic Book : "+min);
        }

        System.out.println("*************List of Fiction type books**************");
        for (Book book : fiction) {
            int max = 0 , min = 0;
            System.out.println(book);
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0 ; i < fiction.size() ; i++) {
                list.add(book.name);
                int val = book.price;
                if(val > max)
                    max = val;
                if(val < min)
                    min = val;
            }
            Collections.sort(list);
            System.out.println("***********List of Fiction books in ascending order***********");
            for(int i = 0 ; i < fiction.size() ; i++)
                System.out.print(list.get(i)+" ");
            System.out.println();
            System.out.print("Maximum price Comic Book : "+max);
            System.out.print("Minimum price Comic Book : "+min);
        }

        System.out.println("*************List of Comic type books**************");
        for (Book book : cooking){
            int max = 0 , min = 0;
            System.out.println(book);
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0 ; i < cooking.size() ; i++) {
                list.add(book.name);
                int val = book.price;
                if(val > max)
                    max = val;
                if(val < min)
                    min = val;
            }
            Collections.sort(list);
            System.out.println("***********List of Fiction books in ascending order***********");
            for(int i = 0 ; i < cooking.size() ; i++)
                System.out.print(list.get(i)+" ");
            System.out.println();
            System.out.print("Maximum price Comic Book : "+max);
            System.out.print("Minimum price Comic Book : "+min);
        }
    }
    }
