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
        System.out.println("------------------------------------------------------");

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
        ArrayList<String>  fiction = new ArrayList<>();
        ArrayList<String>  comic = new ArrayList<>();
        ArrayList<String>  cooking = new ArrayList<>();
        ArrayList<String> fiction_name = new ArrayList<>();
        ArrayList<String> comic_name = new ArrayList<>();
        ArrayList<String> cooking_name = new ArrayList<>();
        ArrayList<Integer> fiction_price = new ArrayList<>();
        ArrayList<Integer> comic_price = new ArrayList<>();
        ArrayList<Integer> cooking_price = new ArrayList<>();

        for(int i = 0 ;i < n ; i++)
        {
            String typa = arr[i].type;
            int pricea = arr[i].price;
            String namea = arr[i].name;
            if(typa.equals("comic")){
                comic.add(namea);
                comic_name.add(namea);
            comic_price.add(pricea);}

            if(typa.equals("fiction")){
                fiction.add(namea);
                fiction_name.add(namea);
            fiction_price.add(pricea);}

            if(typa.equals("cooking")){
                cooking.add(namea);
                cooking_name.add(namea);
            cooking_price.add(pricea);}
        }


        System.out.println("##################Comic type books#####################");
        int max_comic = 0 , min_comic = comic_price.get(0);
        System.out.println("(A) List");
        for (String s : comic)
            System.out.print(s + " ");
        System.out.println();
        System.out.println("(B) Sorted List");
        Collections.sort(comic_name);
        for (String s : comic_name)
            System.out.print(s + " ");
        System.out.println();
        for(int val : comic_price){
            if(val > max_comic)
                max_comic = val;
            if(val < min_comic)
                min_comic = val;
        }
        System.out.println("Maximum Price of Comic Book : "+max_comic);
        System.out.println("Minimum Price of Comic Book : "+min_comic);



        System.out.println("##################Fiction type books#####################");
        int max_ficion = 0 , min_fiction = fiction_price.get(0);
        System.out.println("(A) List");
        for (String s : fiction)
            System.out.print(s + " ");
        System.out.println();
        System.out.println("(B) Sorted List");
        Collections.sort(fiction_name);
        for (String s : fiction_name)
            System.out.print(s + " ");
        System.out.println();
        for(int val : fiction_price){
            if(val > max_ficion)
                max_ficion = val;
            if(val < min_fiction)
                min_fiction = val;
        }
        System.out.println("Maximum Price of Comic Book : "+max_ficion);
        System.out.println("Minimum Price of Comic Book : "+min_fiction);



        System.out.println("##################Cooking type books#####################");
        int max_cooking = 0 , min_cooking = cooking_price.get(0);
        System.out.println("(A) List");
        for (String s : cooking)
            System.out.print(s + " ");
        System.out.println();
        System.out.println("(B) Sorted List");
        Collections.sort(cooking_name);
        for (String s : cooking_name)
            System.out.print(s + " ");
        System.out.println();
        for(int val : cooking_price){
            if(val > max_cooking)
                max_cooking = val;
            if(val < min_cooking)
                min_cooking = val;
        }
        System.out.println("Maximum Price of Comic Book : "+max_cooking);
        System.out.println("Minimum Price of Comic Book : "+min_cooking);
    }
    }
