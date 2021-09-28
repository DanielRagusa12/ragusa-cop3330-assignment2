package ex30;

import ex25.Ex25_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex30_MainTest
{

    @Test
    void multiplication_calc()
    {
        int val;

        Ex30_Main a=new Ex30_Main();

        val=a.multiplication_calc(1,2);

        assertEquals(2,val);
    }

    @Test
    void multiplication_calc2()
    {
        int val;

        Ex30_Main a=new Ex30_Main();

        val=a.multiplication_calc(3,5);

        assertEquals(15,val);
    }
}