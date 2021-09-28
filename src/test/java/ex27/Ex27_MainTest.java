package ex27;

import ex24.Ex24_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex27_MainTest
{

    @Test
    void validation_2char_fname()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_2char_fname("J");

        assertEquals(false,val);
    }

    @Test
    void validation_2char_fname2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_2char_fname("John");

        assertEquals(true,val);
    }

    @Test
    void validation_2char_lname()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_2char_lname("");

        assertEquals(false,val);

    }

    @Test
    void validation_2char_lname2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_2char_lname("Johnson");

        assertEquals(true,val);

    }

    @Test
    void validation_fill_fname()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_fill_fname("John");

        assertEquals(true,val);
    }

    @Test
    void validation_fill_fname2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_fill_fname("");

        assertEquals(false,val);
    }

    @Test
    void validation_fill_lname()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_fill_lname("John");

        assertEquals(true,val);

    }

    @Test
    void validation_fill_lname2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_fill_lname("");

        assertEquals(false,val);

    }

    @Test
    void validation_id()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_id("A12-1234");

        assertEquals(false,val);

    }

    @Test
    void validation_id2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_id("TK-4321");

        assertEquals(true,val);

    }

    @Test
    void validation_zip()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_zip("ABCDE");

        assertEquals(false,val);
    }

    @Test
    void validation_zip2()
    {
        boolean val;

        Ex27_Main a=new Ex27_Main();

        val=a.validation_zip("55555");

        assertEquals(true,val);
    }
}