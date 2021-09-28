package ex33;

import ex32.Ex32_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex33_MainTest {

    @Test
    void answers()
    {
        String val;

        Ex33_Main a=new Ex33_Main();
        int num_arr[]={0,1,2,3};
        String ans_arr[]={"Yes","No","Maybe","Ask again later."};

        for(int i=0;i<4;i++)
        {
            val = a.answers(num_arr[i]);

            assertEquals(ans_arr[i], val);
        }
    }
}