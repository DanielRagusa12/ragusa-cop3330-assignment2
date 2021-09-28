package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.Object;


public class Ex25_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        String password;
        String answer;

        password=input.next();
        int strength=passwordValidator(password);


        switch (strength)
        {
            case 1:
                answer ="The password "+"'"+ password +"'"+ " is a very weak password.";
                break;

            case 2:
                answer ="The password "+"'"+ password +"'"+ " is a weak password.";
                break;

            case 3:
                answer ="The password "+"'"+ password +"'"+ " is a strong password.";
                break;

            default:
                answer ="The password "+"'"+ password +"'"+ " is a very strong password.";
                break;


        }
        System.out.print(answer);

    }

    public static int passwordValidator(String str1)
    {
        int num=0;
        int special=0;
        int letter=0;
        int length=str1.length();
        for(int i=0; i<length;i++)
        {
            char current=str1.charAt(i);
            if(Character.isDigit(current))
            {
                num++;
            }

            if(current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z')
            {
                letter++;
            }
        }
        if(num+letter!=length)
        {
            special++;
        }

        if(length<8 && num==length)
        {
            return 1;
        }

        else if(length<8 && letter==length)
        {
            return 2;
        }
        else if(length>8 && num>0 && letter>0 && special>0)
        {
            return 4;
        }
        else
            return 3;


    }
}

