package ex33;

import java.util.Random;
import java.util.Scanner;

public class Ex33_Main
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        Scanner input= new Scanner(System.in);
        System.out.print("What's your question?"+"\n"+"> ");
        String question= input.next();
        int random_num=rand.nextInt(3);
        System.out.print("\n");
        System.out.print(answers(random_num));

    }
    public static String answers(int a)
    {
        String arr[]={"Yes","No","Maybe","Ask again later."};
        return arr[a];
    }
}
