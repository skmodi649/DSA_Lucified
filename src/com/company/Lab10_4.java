package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab10_4 {
    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        System.out.println("------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of key-value pairs for HashMap 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of key-value pairs for HashMap 2 : ");
        int m = sc.nextInt();

        HashMap<String , String> h1 = new HashMap<>();
        HashMap<String , String> h2 = new HashMap<>();

        System.out.println("*********Putting the keys and values in HashMap 1********** ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Student Name : ");
            String stud_name = sc.next();
            System.out.print("Course Registered separated by a commas without whitespace : ");
            String course = sc.next();
            h1.put(stud_name , course);
        }
        System.out.println("*********Putting the keys and values in HashMap 2**********");
        for(int i = 0 ; i < m ; i++)
        {
            System.out.print("Course Name : ");
            String course_name = sc.next();
            System.out.print("Faculty Name : ");
            String faculty = sc.next();
            h2.put(course_name , faculty);
        }

        // Adding or removing student from h1 hashmap
        // Let's say we have to remove student with name "John"

        h1.remove("John");

        // Let's say we have to add a student named "Smith" and course "Java"

        h1.put("Smith" , "Java");

        // Iterating over and displaying the contents of both HashMaps

        System.out.println("********h1 HashMap**********");
        System.out.println(h1);
        System.out.println("********h2 HashMap**********");
        System.out.println(h2);

        System.out.print("Enter the student name : ");
        String name = sc.next();


        // Iterating over the hashmap using for loop

        String course = ""; // for storing the courses registered by the respective student
        for (Map.Entry<String, String> e : h1.entrySet())
        {
            String student = e.getKey();
            if(student.equals(name)){
                course = e.getValue();
                break;}
        }

        // Now extracting the individual courses for the student

        String[] arrOfStr = course.split(",", -2);
        System.out.println(name+"'s teachers are : ");
        for (String a : arrOfStr)
        {
            for(Map.Entry<String , String> e : h2.entrySet())
            {
                String coursera = e.getKey();
                String teacher = e.getValue();
                if(a.equals(coursera))
                    System.out.println(teacher);
            }
        }
    }
}
