package day05_Unary_ShorthandOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PostPre {
    public static void main(String[] args) {
      // pre; change the value of the variable immediately
      int a= 100;
        System.out.println(++a);// a=101
        System.out.println(a);// a=101
        int b= 100;
        System.out.println(--b);// b=99
        System.out.println(b);//b=99
        //post increment; first passes the current value, then eventually change the value
        int A= 100;
        System.out.println(A++);// A=100
        System.out.println(A);//A=101
        int B= 100;
        System.out.println(B--);//100
        System.out.println(B);//99
        //post & pre increment examples
        int z= 10;
        int x= ++z;
        System.out.println(x);// x is increased by 1,11
        System.out.println(z);//11
        int s= 10;
        int f= s++;
        System.out.println(f);//10
        System.out.println(s);//11
        double t1 = 3.5;
        double t2 =t1--;
        System.out.println(t2);//3.5
        System.out.println(t1);//2.5
        int num= 35;
        System.out.println(num++);//35
        System.out.println(num--);//36








    }




}
