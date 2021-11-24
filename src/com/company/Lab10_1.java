package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab10_1 {
    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        System.out.println("====================================================================");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Number of Names you want to enter in the list : ");
        int n = sc.nextInt();
        System.out.println("Enter the names one by one : ");
        int a = 0;
        while(a < n){
            String name = sc.next();
            list.add(name);
            a++;
        }
        String[] my_str = new String[n];

        for(int i = 0 ; i < n ; i++)
            my_str[i] = list.get(i);

        //Sorting in ascending order of length
        for (int i=1 ;i<n; i++){
            String temp = my_str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < my_str[j].length()){
                my_str[j+1] = my_str[j];
                j--;
            }
            my_str[j+1] = temp;
        }
        System.out.println("***********Ascending order of length******************");
        for(int i=0;i<n;i++)
            System.out.print(my_str[i]+" ");
        System.out.println();

        //Sorting in descending order of length
        for (int i=1 ;i<n; i++){
            String temp = my_str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() > my_str[j].length()){
                my_str[j+1] = my_str[j];
                j--;
            }
            my_str[j+1] = temp;
        }
        System.out.println("****************Descending order of length*******************");
        for(int i=0;i<n;i++)
            System.out.print(my_str[i]+" ");
        System.out.println();

        System.out.println("*******************Based on the first character*********************");
        Collections.sort(list);
        for(int i=0;i<n;i++)
            System.out.print(list.get(i)+" ");

        System.out.println();

        //Sorting on the basis of strings containing 'e' first

        System.out.println("************Based on strings containing letter e first**********************");
        list.sort((o1, o2) -> (o1.indexOf('e') < o2.indexOf('e') ? 1 : 0));
        for(String i:list)
            System.out.print(i+" ");
    }
}
