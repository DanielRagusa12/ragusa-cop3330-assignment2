package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Ex35_Main
{
    public static void main( String[] args )
    {
        ArrayList<String> arr = new ArrayList<>();
        boolean flag=true;
        Scanner input= new Scanner(System.in);
        int num=0;
        String name;

        while(flag)
        {
            System.out.print("Enter a name: ");
            name= input.nextLine();
            if(name.isEmpty())
            {
                break;
            }
            else
                arr.add(num,name);
                num++;

        }
        Random rand = new Random();
        int random_num=rand.nextInt(num);
        System.out.print("The winner is... "+select_winner(random_num,arr)+".");




    }
    public static String select_winner(int num,ArrayList<String> arr)
    {
        return arr.get(num);
    }
}
