package com.company;

import java.util.Scanner;

class threadEven extends Thread
{
    private final int m , n;
    threadEven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower and upper limits respectively for Even sequence : ");
        m = sc.nextInt();
        n = sc.nextInt();
    }
    @Override
    public void run(){
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
class OddThread extends Thread{
    int m , n;
    OddThread()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower and upper limit respectively for odd sequence : ");
        m = sc.nextInt();
        n = sc.nextInt();
    }
    @Override
    public void run()
    {
        for(int i=m;i<=n;i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class Lab8_1 {
    public static void main(String[] args)
    {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        threadEven r = new threadEven();
        Thread t = new Thread(r);  // So 't' is a child thread
        OddThread rt = new OddThread();
        Thread ts = new Thread(rt);   // So 'ts' is a child thread
        t.start();
        ts.start();
    }
}

