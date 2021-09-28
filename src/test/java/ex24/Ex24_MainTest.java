package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex24_MainTest
{

    @Test
    void isAnagram()
    {
        boolean ans=true;
        boolean val;

        Ex24_Main a=new Ex24_Main();

        val=a.isAnagram("note","tone");

        assertEquals(true,val);


    }
    @Test
    void isAnagram2()
    {
        boolean val;

        Ex24_Main a=new Ex24_Main();

        val=a.isAnagram("doge","tone");

        assertEquals(false,val);


    }
    @Test
    void isAnagram3()
    {
        boolean val;

        Ex24_Main a=new Ex24_Main();

        val=a.isAnagram("cool","cooler");

        assertEquals(false,val);


    }



}