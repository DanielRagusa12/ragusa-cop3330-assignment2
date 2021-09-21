package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{

    @Test
    void isAnagram()
    {
        boolean ans=true;
        boolean val;

        App a=new App();

        val=a.isAnagram("note","tone");

        assertEquals(true,val);


    }
    @Test
    void isAnagram2()
    {
        boolean val;

        App a=new App();

        val=a.isAnagram("doge","tone");

        assertEquals(false,val);


    }
    @Test
    void isAnagram3()
    {
        boolean val;

        App a=new App();

        val=a.isAnagram("cool","cooler");

        assertEquals(false,val);


    }



}