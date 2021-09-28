package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class Ex27_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        String fname;
        String lname;
        String zip;
        String id;

        System.out.print("Enter the first name: ");
        fname=input.nextLine();

        System.out.print("Enter the last name: ");
        lname=input.nextLine();

        System.out.print("Enter the ZIP code: ");
        zip=input.next();

        System.out.print("Enter the employee ID: ");
        id=input.next();

        String answer=validateInput(fname,lname,zip,id);


        System.out.print(answer);




    }
    public static String validateInput(String fname,String lname,String zip,String id)
    {
        String error1="";
        String error2="";
        String error3="";
        String error4="";
        String error5="";
        String error6="";
        String final_answer;
        validation_2char_fname(fname);
        validation_2char_lname(lname);
        validation_fill_fname(fname);
        validation_fill_lname(lname);
        validation_id(id);
        validation_zip(zip);
        if(validation_2char_fname(fname) && validation_2char_lname(lname) && validation_id(id) && validation_zip(zip))
        {
            return final_answer="There were no errors found.";
        }
        if(!validation_2char_fname(fname))
        {
            error1="The first name must be at least 2 characters long."+"\n";
        }
        if(!validation_2char_lname(lname))
        {
            error2="The last name must be at least 2 characters long."+"\n";
        }
        if(!validation_fill_fname(fname))
        {
            error3="The first name must be filled in."+"\n";
        }
        if(!validation_fill_lname(lname))
        {
            error4="The last name must be filled in."+"\n";
        }
        if(!validation_id(id))
        {
            error5="The employee ID must be in the format of AA-1234."+"\n";
        }
        if(!validation_zip(zip))
        {
            error6="The zipcode must be a 5 digit number."+"\n";
        }

        return final_answer=error1+error2+error3+error4+error5+error6;



    }


    public static boolean validation_2char_fname(String fname)
    {
        if(fname.length()<2)
        {
            return false;
        }
        else
            return true;

    }

    public static boolean validation_2char_lname(String lname)
    {
        if(lname.length()<2)
        {
            return false;
        }
        else
            return true;

    }
    public static boolean validation_fill_fname(String fname)
    {
        if(fname.length()==0)
        {
            return false;
        }
        else
            return true;
    }

    public static boolean validation_fill_lname(String lname)
    {
        if(lname.length()==0)
        {
            return false;
        }
        else
            return true;
    }

    public static boolean validation_id(String id)
    {
        int num=0;
        int letter=0;
        int special=0;
        for(int i=0;i<id.length();i++)
        {
            char current=id.charAt(i);
            if(Character.isDigit(current))
            {
                num++;
            }

            if(current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z')
            {
                letter++;
            }
        }
        if(num+letter!=id.length())
        {
            special++;
        }
        if(letter==2 && num==4 && special==1)
        {
            return true;
        }
        else
            return false;

    }

    public static boolean validation_zip(String zip)
    {
        int num=0;
        for(int i=0;i<zip.length();i++)
        {
            char current=zip.charAt(i);
            if(Character.isDigit(current))
            {
                num++;
            }

        }
        if(num==zip.length())
        {
            return true;
        }
        else
            return false;

    }


}
