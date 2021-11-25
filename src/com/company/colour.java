package com.company;

import java.util.*;
public class colour
{
    public static void main(String args[])
    {
        System.out.println("Samarjit Bedi 18BCI0221");
        Scanner s = new Scanner(System.in);
        HashMap<String,ArrayList<String>>h1 = new HashMap<String,ArrayList<String>>();
        HashMap<String,String>h2 = new HashMap<String,String>();
        HashSet<String>globalist = new HashSet<String>();
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter Name Of Student:");
            String name = s.nextLine();
            System.out.println("Enter Comma Separated Employees:");
            String sub = s.nextLine();
            ArrayList<String>subs = new ArrayList<String>(Arrays.asList(sub.split(",")));
            for(String x:subs)
            {
                globalist.add(x);
            }
            h1.put(name,subs);
        }
        System.out.println(h1);
        System.out.println("Subjects = "+globalist);
        for(String x:globalist)
        {
            System.out.println("Enter Teacher Of Subject:");
            h2.put(x,s.nextLine());
        }
        System.out.println("Enter Student name:");
        String name = s.nextLine();
        ArrayList<String>search_subject = h1.get(name);
        System.out.println("Student->"+name+"has->"+"\n");
        for(String subs:search_subject)
        {
            System.out.println(h2.get(subs));
        }
    }
}
