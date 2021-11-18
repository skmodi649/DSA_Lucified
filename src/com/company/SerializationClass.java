package com.company;
import java.io.*;

public class SerializationClass{
    public static void main(String[] args){
        Karamchari emp = new Karamchari();
        emp.name = "Suraj Kumar";
        emp.email = "Suraj.Kumar@gmail.com";

        try{
            FileOutputStream fileOut = new FileOutputStream("filename.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in filename.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
