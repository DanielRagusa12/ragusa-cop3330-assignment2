package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Random;

public class Ex32_Main
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        Scanner input= new Scanner(System.in);
        System.out.print("Let's play Guess the Number!"+"\n");
        String guess;
        int Guess;
        int bad_guess=1;

        int difficulty;

        boolean flag=true;
        int Flag=0;
        int random_num=0;
        while(flag)
        {
            System.out.print("\n"+"Enter the difficulty level (1, 2, or 3): ");
            difficulty= input.nextInt();
            if(difficulty==1)
            {
                random_num=rand.nextInt((10 - 1) + 1) + 1;
            }
            if(difficulty==2)
            {
                random_num=rand.nextInt((100 - 1) + 1) + 1;
            }
            if(difficulty==3)
            {
                random_num=rand.nextInt((1000 - 1) + 1) + 1;
            }

            System.out.print("I have my number. What's your guess? ");

            while(true)
            {
                try
                {
                    guess=input.next();
                    Guess =Integer.parseInt(guess);
                    if(Guess!=random_num)
                    {
                        bad_guess++;
                    }
                    if(Guess==random_num)
                    {
                        System.out.print("You got it in "+(bad_guess)+ " guesses!"+"\n");
                        break;
                    }
                    System.out.print(guess_help(Guess,random_num));

                }
                catch(NumberFormatException e)
                {
                    bad_guess++;
                    System.out.print("Please enter a number ");
                }

                if(Flag==1)
                {
                    break;
                }

            }
            System.out.print("\n"+"Do you wish to play again (Y/N)? ");
            String answer= input.next();
            if(answer.equals("n"))
            {
                break;
            }


        }


    }
    public static String guess_help(int guess,int random_num)
    {
        if(guess<random_num)
        {
            return "Too low. Guess again: ";
        }
        if(guess>random_num)
        {
            return "Too high. Guess again: ";
        }
        else
            return "";
    }
}
