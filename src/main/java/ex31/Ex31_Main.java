package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex31_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        int flag=0;
        String age;
        String resting_rate;
        int Resting_Rate=0;
        int Age=0;

        while(true)
        {
            try
            {
                resting_rate=input.next();
                age=input.next();
                Resting_Rate =Integer.parseInt(resting_rate);
                Age =Integer.parseInt(age);
                flag=1;

            }
            catch(NumberFormatException e)
            {

            }
            catch(ArithmeticException e)
            {

            }
            if(flag==1)
            {
                break;
            }

        }

        System.out.println("Resting Pulse: " + Resting_Rate + " Age: " + Age+"\n");
        double Target_Rate=0;

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");


        for(double i=55;i<=95;)
        {
            Target_Rate=Karvonen(Age,Resting_Rate,i);
            System.out.println(i+"%     | " +Target_Rate+" bpm");

            i+=5;
        }


    }
    public static double Karvonen(int age, int resting_rate, double intensity)
    {
        intensity/=100;
        double TargetHeartRate = (((220 - age) - resting_rate) * intensity) + resting_rate;
        return (int) Math.round(TargetHeartRate);
    }
}
