package ex34;

import ex33.Ex33_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex34_MainTest {

    @Test
    void removal_verification()
    {
        boolean val;

        Ex34_Main a=new Ex34_Main();
        String name="Chris Jones";
        String list[]={"John Smith","Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};

        val =a.removal_verification(name,list);

        assertEquals(true, val);

    }
}