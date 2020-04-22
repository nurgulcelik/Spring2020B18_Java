package day04_JavaRecap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class variables_practices {
    public static void main(String[] args) {
// DataType variableName = Data;
        byte num1= 115;
        short num2= num1;
        int num4= num1;//int is prefered by compile
        long num5= 999999999l;
        float num6= 100l;// 100.0 design for decimal
        System.out.println(num6);
        float num7= 0.5f;//0.5
        double num8= 0.5f;
        double num9= 999999l;
        double num10= 100.5;
        System.out.println(num10);
        char ch1='$';//$ every single character has corresponding number
        System.out.println(ch1);
        char ch2=2000;//0-65565
        System.out.println(ch2);
        int a1= '8';
        System.out.println(a1);
        int a2='z';
        System.out.println(a2);
        double d1= 'z'+'8';
        System.out.println(d1);
        char ch4= 'z'+'8';
        System.out.println(ch4);
        boolean bool1= true;
        boolean bool2= false;// we can also use for comparasion operator
        System.out.println( 9>10);//false
        System.out.println(9!=10);//true
        System.out.println('a'=='b');//false
        System.out.println(9>=9);//true
        // system.out.println('a'=="a"); double quote does not match single character

        System.out.println('a'=='b'-1 );
        // 97= 98-1= 97 true
        System.out.println("Muhtar" != "Good Guy");//true
        System.out.println("Muhtar"=="Good Guy");//false
        System.out.println("Muhtar"=="muhtar");//false
boolean r1=!true;//false
        System.out.println(r1);//false
        System.out.println(!r1);//true
        System.out.println(!true==false);//true
        System.out.println(!true==!false);//false




    }








}
