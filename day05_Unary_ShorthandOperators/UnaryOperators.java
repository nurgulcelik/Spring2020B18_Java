package day05_Unary_ShorthandOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class UnaryOperators {
    public static void main(String[] args) {
int a= +10;
int b= +a;
//positive 10
        System.out.println(a);
        System.out.println(b);
        int a2=-10;
        boolean result1 = a2>0;
        //false
        boolean result2 =a2<0;
        //true
        System.out.println(result1);
        System.out.println(result2);
        int x1 =-10;
        int y1= -x1;
        System.out.println(y1);
        int x2= 20;
        int y2= -x2;
        System.out.println(y2);
        int x3=+20;
        int y3= +x3;
        System.out.println(y3);
        //pre increment
        int Z= 100;
        System.out.println(++Z);//101
        System.out.println(Z);//101
        int P = 100;
        //post increment
        System.out.println(P++);// first passes the current value,100
        System.out.println(P);// increases the value by 1,101

int a12= 50;
a12= --a12 + a12++ + a12-- + a12++;
            System.out.println(a12);




    }


}
