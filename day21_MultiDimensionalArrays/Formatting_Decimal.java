package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimal {
    public static void main(String[] args) {
        DecimalFormat Df= new DecimalFormat("0.00");
        double a=10.0/3.0;
        System.out.println(a);
        System.out.println(Df.format(a));
        System.out.println(2.364532);
        System.out.println(Df.format(2.364532));
    }
}
