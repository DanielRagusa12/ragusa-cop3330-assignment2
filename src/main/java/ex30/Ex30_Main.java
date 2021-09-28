package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex30_Main
{
    public static void main( String[] args )
    {
        for(int rows=0;rows<=11;rows++)
        {
            for(int columns=0;columns<=11;columns++)
            {
                int result=multiplication_calc(rows+1,columns+1);
                System.out.printf("%4d",result);
            }
            System.out.print("\n");
        }


    }
    public static int multiplication_calc(int num1, int num2)
    {
        return num1*num2;
    }

}
