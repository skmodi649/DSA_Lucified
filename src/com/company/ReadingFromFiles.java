package com.company;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] abc) throws IOException
    {
        JOptionPane.showMessageDialog(null , "JAVA is one of the best programming languages");
        System.out.println("**********First File Contents***********");
        File file = new File("OutputFile.txt");

        //Now checking if the file exists
        if(file.exists())
        {
            Scanner inputFile = new Scanner(file);

            //Reading the file using Scanner class and printing the result
            //Extract the line and then move the cursor to the next line using println
           while(inputFile.hasNext())
           {
               System.out.println(inputFile.nextLine());
           }
            //Closing the file
            inputFile.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null , "The file does not exist");
        }

        System.out.println("**********Second File Contents**********");

        //Let's now read another file

        File filenum = new File("NumOutputFile.txt");

        //Now checking if the file exits
        if(file.exists())
        {
            Scanner inputnumfile = new Scanner(filenum);
            while(inputnumfile.hasNext())
            {
                System.out.print(inputnumfile.nextInt() + " ");
            }
            //Closing the file
            inputnumfile.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null , "The file does not exist");
        }
    }
}
