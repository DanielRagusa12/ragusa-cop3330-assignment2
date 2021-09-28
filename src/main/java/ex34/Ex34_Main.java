package ex34;

import java.util.Objects;
import java.util.Scanner;

public class Ex34_Main
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in).useDelimiter("\n");
        String Employee_Names[]={"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        System.out.print("There are 5 employees:"+"\n");
        for(int i=0;i<5;i++)
        {
            System.out.print(Employee_Names[i]+"\n");
        }
        System.out.print("\n"+"Enter an employee name to remove: ");
        String name= input.next();
        String [] New_Employee_List=new String[5];
        int num=0;
        for(int i=0;i<5;i++)
        {
            if(!Objects.equals(name,Employee_Names[i]))
            {
                New_Employee_List[num]=Employee_Names[i];
                num++;
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.print(New_Employee_List[i]+"\n");
        }



    }

    public static boolean removal_verification(String name, String Employee_List[])
    {
        for(int i=0;i<4;i++)
        {
            if(Objects.equals(name,Employee_List[i]))
            {
                return false;
            }

        }
        return true;
    }
}
