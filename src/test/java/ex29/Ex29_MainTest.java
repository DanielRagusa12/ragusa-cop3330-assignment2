package ex29;

import ex28.Ex28_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex29_MainTest {

    @Test
    void rate_of_return()
    {
        int val;

        Ex29_Main a=new Ex29_Main();

        val=a.rate_of_return(4);

        assertEquals(18,val);
    }
}