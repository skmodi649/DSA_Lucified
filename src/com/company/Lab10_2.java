package com.company;

import java.util.Scanner;

public class Lab10_2 {
    public String printCapitalised(String str) {
        char ch = str.charAt(0);
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
            str = ch + str.substring(1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sent = sc.next();
        sent = sent + sc.nextLine();

        String[] words = sent.split("\\s");//splits the string based on whitespace

        Lab10_2 obj = new Lab10_2();
        StringBuilder newsent = new StringBuilder(" ");
        for (String word : words) {
            String str = obj.printCapitalised(word) + " ";
            newsent.append(str);
        }
        System.out.println(newsent);
    }
}
