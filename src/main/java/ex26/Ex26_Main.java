package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex26_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        double balance;
        double apr;
        double payment;
        double months;

        System.out.print("What is your balance? ");
        balance=input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr=input.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        payment=input.nextDouble();

        months=PaymentCalculator.calculateMonthsUntilPaidOff(balance,apr,payment);

        System.out.print("It will take you " +(months)+ " months to pay off this card.");




    }
}
