package com.company;

import java.util.Scanner;

public class Array_operation_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = arr[0] , max = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum number : "+max);
        System.out.println("Minimum number : "+min);
    }
}
