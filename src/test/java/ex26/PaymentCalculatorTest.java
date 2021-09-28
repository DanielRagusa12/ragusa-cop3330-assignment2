package ex26;

import ex27.Ex27_Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff()
    {
        int val;

        Ex26_Main a=new Ex26_Main();

        val=PaymentCalculator.calculateMonthsUntilPaidOff(5000,12,100);

        assertEquals(70,val);
    }
}