package ex32;

import ex30.Ex30_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex32_MainTest {

    @Test
    void guess_help()
    {
        String val;

        Ex32_Main a=new Ex32_Main();

        val=a.guess_help(1,9);

        assertEquals("Too low. Guess again: ",val);
    }
    @Test
    void guess_help2()
    {
        String val;

        Ex32_Main a=new Ex32_Main();

        val=a.guess_help(9,7);

        assertEquals("Too high. Guess again: ",val);
    }
}