package com.company;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFiles {
    public static void main(String[] args) throws IOException
    {
        //Create the file and open the file
        //If the file exists it will replace the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");
        outputFile.println("This is line 4");

        outputFile.close();  //Closing the file

        //Let's create another file for storing numbers
        PrintWriter numOutputFile = new PrintWriter("NumOutputFile.txt");

        numOutputFile.println(10);
        numOutputFile.println(20);
        numOutputFile.println(30);
        numOutputFile.println(40);
        numOutputFile.println(50);

        numOutputFile.close(); //Closing the file
    }
}
