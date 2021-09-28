package ex30;

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
                System.out.print((result)+"\t");
            }
            System.out.print("\n");
        }


    }
    public static int multiplication_calc(int num1, int num2)
    {
        return num1*num2;
    }

}
