package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Karamchari emp = null;
        try{
            FileInputStream fileinput = new FileInputStream("filename.txt");
            ObjectInputStream obj = new ObjectInputStream(fileinput);

            emp = (Karamchari) obj.readObject();
            obj.close();
            fileinput.close();
        }
        finally {
            System.out.println("Deserializing Karamchari...........");
            assert emp != null;
            System.out.println("Karmchari Name : "+emp.name);
            System.out.println("Karmchari email : "+emp.email);
        }
    }
}
