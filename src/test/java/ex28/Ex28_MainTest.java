package ex28;

import ex27.Ex27_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex28_MainTest {

    @Test
    void test_add()
    {
        int val;

        Ex28_Main a=new Ex28_Main();

        val=a.test_add(1,1,1,1,1);

        assertEquals(5,val);
    }

    @Test
    void test_add2()
    {
        int val;

        Ex28_Main a=new Ex28_Main();

        val=a.test_add(1,2,3,4,5);

        assertEquals(15,val);
    }

    @Test
    void test_add3()
    {
        int val;

        Ex28_Main a=new Ex28_Main();

        val=a.test_add(2,159,25,4,87);

        assertEquals(277,val);
    }
}