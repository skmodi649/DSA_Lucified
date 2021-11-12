package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    String name , school , email , address , id;
    Employee(String name ,String school, String email, String address, String id)
    {
        this.name = name;
        this.school = school;
        this.email = email;
        this.id = id;
    }

 public static void main(String[] args) throws ClassNotFoundException
 {
     System.out.println("Name : Suraj Kumar");
     System.out.println("Registration Number : 20BCE2835");

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of employees : ");
     int n = sc.nextInt();

     Employee arr[] = new Employee[n];
     for(int i = 0 ; i < n ; i++)
     {
         System.out.println("********* Employee "+(i+1)+" ************");
         System.out.println("Enter the name , id , school , email and address of the employee respectively : ");
         String name = sc.next();
         name = name + sc.nextLine();
         String id = sc.next();
         String school = sc.next();
         String email = sc.next();
         String address = sc.next();
         address = address + sc.nextLine();
         arr[i] = new Employee(name , school , email , address , id);
     }

     ArrayList<Employee> lista = new ArrayList<>();
     for(int i = 0 ;i < n;i++)
     {
         lista.add(arr[i]);
     }
     try {
         File myObj = new File("Employee_Info.txt");
         if (myObj.createNewFile()) {
             System.out.println("File created: " + myObj.getName());
         } else {
             System.out.println("File already exists.");
         }

         FileOutputStream fos = new FileOutputStream("Employee_info");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(lista);
         oos.close();
         fos.close();

         //Now deserializing the array of objects

         ArrayList<Employee> list;
         FileInputStream fis = new FileInputStream("Employee_Info.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         list = (ArrayList) ois.readObject();	//Casting
         ois.close();
         fis.close();

         int counter = 0;

         for (Employee temp: list) {		//printing the array
             if(temp.school == "SCOPE" && temp.address == "Vellore")
                 System.out.println(temp);
             counter = 1;
         }
         if(counter == 0)
             System.out.println("No such employees match the criteria");
     } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
     }
 }
}
