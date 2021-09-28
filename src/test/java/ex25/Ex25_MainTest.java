package ex25;

import ex24.Ex24_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex25_MainTest
{

    @Test
    void passwordValidatorTest1()
    {
        int val;

        Ex25_Main a=new Ex25_Main();

        val=a.passwordValidator("12345");

        assertEquals(1,val);
    }

    @Test
    void passwordValidatorTest2()
    {
        int val;

        Ex25_Main a=new Ex25_Main();

        val=a.passwordValidator("abcdef");

        assertEquals(2,val);
    }

    @Test
    void passwordValidatorTest3()
    {
        int val;

        Ex25_Main a=new Ex25_Main();

        val=a.passwordValidator("abc123xyz");

        assertEquals(3,val);
    }

    @Test
    void passwordValidatorTest4()
    {
        int val;

        Ex25_Main a=new Ex25_Main();

        val=a.passwordValidator("1337h@xor!");

        assertEquals(4,val);
    }

}