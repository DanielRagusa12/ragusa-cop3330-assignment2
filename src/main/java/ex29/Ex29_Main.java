package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex29_Main
{

    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        String number;
        int Number=0;

        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                number=input.next();
                Number =Integer.parseInt(number);
                rate_of_return(Number);
                break;

            }
            catch(NumberFormatException e)
            {
                System.out.print("Sorry. That's not a valid input."+"\n");
            }
            catch(ArithmeticException e)
            {
                System.out.print("Sorry. That's not a valid input."+"\n");
            }


        }

    }
    public static int rate_of_return (int number)
    {
        int answer=72/number;
        System.out.println("It will take "+(answer)+" years to double your initial investment.");
        return answer;
    }

}