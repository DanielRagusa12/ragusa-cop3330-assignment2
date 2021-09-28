package ex38;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex38_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String answer= input.next();
        String[] arr_answer = new String[answer.length()];
        arr_answer=answer.split(" ");
        ArrayList<Integer> filtered_array = new ArrayList<>();
        filtered_array=filterEvenNumbers(arr_answer);

        System.out.print("The even numbers are ");
        for(int i=0;i<filtered_array.size();i++)
        {
            System.out.print(filtered_array.get(i)+" ");
        }
        System.out.print(".");




    }
    public static ArrayList<Integer> filterEvenNumbers(String [] arr1)
    {
        ArrayList<Integer> filtered_array = new ArrayList<>();
        int j=0;
        for(int i=0;i<arr1.length;i++)
        {
            int num = Integer.parseInt(arr1[i]);
            if(num%2==0)
            {
                filtered_array.add(j,num);
                j++;
            }
        }
        return filtered_array;
    }
}
