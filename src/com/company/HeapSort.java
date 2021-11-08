package com.company;

import java.util.Scanner;

public class HeapSort {
    public void BuildHeap(int[] arr, int n)
    {
        for(int i = n / 2 - 1 ; i >= 0 ; i--)
        {
            MaxHeapify(arr , n , i);
        }
    }

    public void MaxHeapify(int[] arr, int n , int i)
    {
        int largest = i , left = 2*i + 1 , right = 2*i + 2;
        if(left < n && arr[left] > arr[largest])
           largest = left;
        if(right < n && arr[right] > arr[largest])
           largest = right;
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(arr , n , largest);
        }
    }

    public void heapSort(int[] arr, int n)
    {
        BuildHeap(arr , n);
        for(int i = n - 1 ; i >= 1 ; i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            MaxHeapify(arr , i , 0);
        }

        /*
        i = size of the reduced heap
        0 = starting index is the root of the heap
         */
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        HeapSort ob = new HeapSort();
        ob.heapSort(arr , n);
    for(int j = 0 ; j < n ; j++)
    {
        System.out.print(arr[j] + " ");
    }
    }
}
