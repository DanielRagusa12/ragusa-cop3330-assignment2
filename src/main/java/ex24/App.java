package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Arrays;


public class App
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        String str_1;
        String str_2;

        System.out.print("Enter two strings and I'll tell you if they are anagrams:"+"\n");
        System.out.print("Enter the first string: ");
        str_1=input.next();

        System.out.print("Enter the second string: ");
        str_2=input.next();

        boolean result=isAnagram(str_1,str_2);

        if(result)
        {
            System.out.print("\""+str_1+"\" and "+"\"" +str_2+ "\""+" are anagrams.");
            System.exit(0);
        }

        else
            System.out.print("\""+str_1+"\" and "+"\"" +str_2+ "\""+" are not anagrams.");


    }

    public static boolean isAnagram(String str1,String str2)
    {
        int length1=str1.length();
        int length2=str2.length();
        if(length1!=length2)
        {
            return false;
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);


    }
}
