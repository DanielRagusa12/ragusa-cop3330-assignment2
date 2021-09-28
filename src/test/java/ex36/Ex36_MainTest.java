package ex36;

import ex35.Ex35_Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ex36_MainTest {

    @Test
    void average()
    {
        double val;

        Ex36_Main a=new Ex36_Main();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,100);
        arr.add(1,200);
        arr.add(2,1000);
        arr.add(3,300);

        val =a.average(arr,4);

        assertEquals(400.0, val);
    }

    @Test
    void max()
    {
        int val;

        Ex36_Main a=new Ex36_Main();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,100);
        arr.add(1,200);
        arr.add(2,1000);
        arr.add(3,300);

        val =a.max(arr);

        assertEquals(1000, val);

    }

    @Test
    void min()
    {
        int val;

        Ex36_Main a=new Ex36_Main();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,100);
        arr.add(1,200);
        arr.add(2,1000);
        arr.add(3,300);

        val =a.min(arr);

        assertEquals(100, val);

    }

    @Test
    void std()
    {
        double val;

        Ex36_Main a=new Ex36_Main();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,100);
        arr.add(1,200);
        arr.add(2,1000);
        arr.add(3,300);

        val =a.std(arr,4);

        assertEquals(353.55, val);
    }
}