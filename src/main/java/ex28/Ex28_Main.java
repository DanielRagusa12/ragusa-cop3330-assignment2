package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex28_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        int num=0;
        int total=0;

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a number: ");
            num=input.nextInt();
            total+=num;
        }


        System.out.print("The total is "+(total)+".");

    }

    public static int test_add(int a,int b,int c,int d,int e)
    {
        int total=0;
        int[] array={a,b,c,d,e};
        for(int i=0;i<5;i++)
        {
            total+=array[i];
        }
        return total;
    }


}

