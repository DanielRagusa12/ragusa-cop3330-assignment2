package ex35;

import ex34.Ex34_Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ex35_MainTest {

    @Test
    void select_winner()
    {
        String val;

        Ex35_Main a=new Ex35_Main();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(0, "Homer");
        arr.add(1, "Bart");
        arr.add(2, "Maggie");
        arr.add(3, "Lisa");
        arr.add(4, "Moe");

        val =a.select_winner(0,arr);

        assertEquals("Homer", val);
    }
    @Test
    void select_winner2()
    {
        String val;

        Ex35_Main a=new Ex35_Main();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(0, "Homer");
        arr.add(1, "Bart");
        arr.add(2, "Maggie");
        arr.add(3, "Lisa");
        arr.add(4, "Moe");

        val =a.select_winner(3,arr);

        assertEquals("Lisa", val);
    }
}