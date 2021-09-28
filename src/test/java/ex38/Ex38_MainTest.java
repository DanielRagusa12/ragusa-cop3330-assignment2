package ex38;

import ex37.Ex37_Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ex38_MainTest {

    @Test
    void filterEvenNumbers()
    {
        boolean flag=false;
        Ex38_Main a=new Ex38_Main();
        String[] arr_answer ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        ArrayList<Integer> filtered_array = new ArrayList<>();
        filtered_array = Ex38_Main.filterEvenNumbers(arr_answer);

        System.out.print(filtered_array);

        Integer[] answer_array={2,4,6,8,10,12,14};
        for(int i=0;i< filtered_array.size();i++)
        {
            if(filtered_array.get(i)==answer_array[i])
            {
                flag=true;
            }
        }
        assertEquals(true,flag);
    }
}