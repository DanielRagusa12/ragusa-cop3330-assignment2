package ex37;

import ex35.Ex35_Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ex37_MainTest {

    @Test
    void generate_password()
    {

        Ex37_Main a=new Ex37_Main();
        int length=8;
        int special=2;
        int number=2;
        String[] letters = {"a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String [] specials = {"&","$","#","@","!"};
        String password = Ex37_Main.generate_password(letters,numbers,specials,length,special,number);
        System.out.print(password);
        int letter_count=0;
        int number_count=0;
        int special_count=0;
        boolean answer=false;
        for(int i=0;i<password.length();i++)
        {
            int flag=0;
            char current=password.charAt(i);
            if(Character.isAlphabetic(current))
            {
                letter_count++;
            }
            if(Character.isDigit(current))
            {
                number_count++;
            }
            if(!Character.isDigit(current) && !Character.isAlphabetic(current))
            {
                special_count++;
            }


        }

        if(letter_count>=number_count+special_count && number_count==2 && special_count==2)
        {
            answer=true;
        }
        System.out.print("\n"+letter_count+"\n");
        System.out.print(special_count+"\n");
        System.out.print(number_count+"\n");


        assertEquals(true,answer);
    }
}