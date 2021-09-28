package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex36_Main
{
    public static void main( String[] args )
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input= new Scanner(System.in);
        int flag=0;
        String answer="";
        int Answer;
        int num=0;

        //input
        while(true)
        {
            try
            {
                System.out.print("Enter a number: ");
                answer = input.next();
                Answer = Integer.parseInt(answer);
                arr.add(num,Answer);
                num++;

            }
            catch (NumberFormatException e)
            {
                if (answer.equals("done"))
                {
                    break;
                }
            }
        }

        //output
        Print_Array(arr,num);
        System.out.print("\n"+"The average is "+average(arr,num));
        System.out.print("\n"+"The minimum is "+min(arr));
        System.out.print("\n"+"The maximum is "+max(arr));
        System.out.print("\n"+"The standard deviation is "+std(arr,num));

    }
    public static void Print_Array( ArrayList<Integer> arr,int num)
    {
        System.out.print("Numbers: ");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr.get(i));
            if(i<num-1)
            {
                System.out.print(", ");
            }
        }
    }
    //processing
    public static double average(ArrayList<Integer> arr,int num)
    {
        double total=0.0;
        for(int i=0;i<num;i++)
        {
            total=total+arr.get(i);
        }
        double answer=total/num;
        BigDecimal digit_rounding = new BigDecimal(answer).setScale(2, RoundingMode.HALF_UP);
        double amount_rounded = digit_rounding.doubleValue();
        return (amount_rounded);
    }

    public static int max(ArrayList<Integer> arr)
    {
        return Collections.max(arr);
    }

    public static int min(ArrayList<Integer> arr)
    {
        return Collections.min(arr);
    }

    public static double std(ArrayList<Integer> arr,int num)
    {
        ArrayList<Double> arr2 = new ArrayList<>();
        double total=0.0;
        double mean=average(arr,num);
        for(int i=0;i<num;i++)
        {
           double squared=Math.pow(arr.get(i)-mean,2);
           arr2.add(i,squared);
        }
        for(int i=0;i<num;i++)
        {
            total=total+arr2.get(i);
        }
        double mean2=total/num;
        double answer=Math.sqrt(mean2);
        BigDecimal digit_rounding = new BigDecimal(answer).setScale(2, RoundingMode.HALF_UP);
        double amount_rounded = digit_rounding.doubleValue();
        return amount_rounded;
    }

}
