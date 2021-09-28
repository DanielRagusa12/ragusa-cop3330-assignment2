package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex37_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        int length;
        int special;
        int number;
        String[] letters = {"a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String [] specials = {"&","$","#","@","!"};

        System.out.print("What's the minimum length? ");
        length= input.nextInt();

        System.out.print("How many special characters? ");
        special= input.nextInt();

        System.out.print("How many numbers? ");
        number= input.nextInt();
        System.out.print("Your password is "+generate_password(letters,numbers,specials,length,special,number));

    }
    public static String generate_password(String[] letters,String[] numbers,String[] specials,int length,int special_count,int number_count)
    {
        String password="";
        Random rand = new Random();

        int random_num_letter=rand.nextInt(27);
        int random_num_number=rand.nextInt(10);
        int random_num_special=rand.nextInt(5);
        int random_select;
        boolean special_flag=false;
        boolean number_flag=false;
        boolean letter_flag=false;
        do {
            random_select = rand.nextInt(4);

            if (random_select == 1 && !special_flag)
            {
                special_flag = true;

                for (int j = 0; j < special_count; j++)
                {
                    password = password + specials[rand.nextInt(4)];
                }
            }
            if (random_select == 2 && !number_flag)
            {
                number_flag = true;

                for (int k = 0; k < number_count; k++)
                {
                    password = password + numbers[rand.nextInt(9)];
                }
            }
            if (random_select == 3)
            {
                password = password + letters[rand.nextInt(26)];

            }

        } while (password.length() <= length);
        return password;
    }

}
