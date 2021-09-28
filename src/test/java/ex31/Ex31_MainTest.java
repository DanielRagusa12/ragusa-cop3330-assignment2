package ex31;

import ex30.Ex30_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex31_MainTest {

    @Test
    void karvonen()
    {
        double val;

        Ex31_Main a=new Ex31_Main();
        double intensity=55;
        double answer[]={138,145,151,158,165,171,178,185,191};
        for(int i=0;i<=8;i++)
        {
            val = a.Karvonen(22, 65, intensity);
            assertEquals(answer[i], val);
            intensity+=5;
        }

    }
}