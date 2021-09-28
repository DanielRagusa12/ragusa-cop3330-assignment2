package ex26;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentCalculator
{
    public static int calculateMonthsUntilPaidOff(double balance, double APR, double payment)
    {
        double i;
        double step1;
        double step2;
        double step3;
        double step4;
        i = APR/(365*100);
        step1 = balance/payment;
        step2 = Math.pow((1+i),30);
        step3 = Math.log10(1+i);
        step4 = Math.log10(1 + step1 *(1 - step2));
        return (int)Math.ceil((-1 * step4) / (step3*30));




    }
}
