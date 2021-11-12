package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Lab10_1 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Anmol");
        list.add("Gautam");
        list.add("Nevgi");
        list.add("Akash");

        String[] my_str = new String[5];

        for(int i = 0 ; i < 5 ; i++)
            my_str[i] = list.get(i);

        //Sorting in ascending order of length
        for (int i=1 ;i<5; i++){
            String temp = my_str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < my_str[j].length()){
                my_str[j+1] = my_str[j];
                j--;
            }
            my_str[j+1] = temp;
        }
        for(int i=0;i<5;i++)
            System.out.print(my_str[i]+" ");
        System.out.println();

        //Sorting in descending order of length
        for (int i=1 ;i<5; i++){
            String temp = my_str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() > my_str[j].length()){
                my_str[j+1] = my_str[j];
                j--;
            }
            my_str[j+1] = temp;
        }

        for(int i=0;i<5;i++)
            System.out.print(my_str[i]+" ");
        System.out.println();

        //Sorting alphabetically based on first character
        Collections.sort(list);
        for(int i=0;i<5;i++)
            System.out.print(list.get(i)+" ");

        //Sorting on the basis of strings containing 'e' first

        list.sort((o1, o2) -> (o1.indexOf('e') < o2.indexOf('e') ? 1 : 0));
        for(String i:list)
            System.out.println(i);
    }
}
