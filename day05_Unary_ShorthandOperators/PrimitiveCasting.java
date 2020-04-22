package day05_Unary_ShorthandOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrimitiveCasting {
    public static void main(String[] args) {
       // implicit casting: they are done automatically
 int a = 10;
 long b = a; // implicit casting is done automatically
        // int c= b; b is still long data type
        int a1= 100;
        long b1 = (long)a1;// manually doing implicit casting
     // int c1 = b1;

    //Explicit casting: casting larger primitive type to smaller primitive types

    int Inum = 100;
    byte Bnum = (byte) Inum;
    short Snum= (short) Inum;
    short Snum2 = (byte) Inum; // casting has to be same or smaller than size
       double Dnum = 5.5;
       float Fnum = (int)Dnum;

       float Fnum2= (float) Dnum; //5.5
        System.out.println(Fnum);//5.0
        double D1 = 10.5;
        long L1 = ( int) D1;
        System.out.println(D1);
        System.out.println(L1);
 float F1 = 60.5f;
 int i1 = (int) F1;
        System.out.println(i1);
        long largeNum = 9999999999l;
        int intNum = ( int)largeNum;
        System.out.println(intNum);// it gives different number because it is out of int range
char ch1= 'a';
short sh1= (short) ch1;
        System.out.println(sh1);
        char ch2= 23456;
        System.out.println(ch2);
        double dbl1 = ch2;
        System.out.println(dbl1);
        int z1 = 10;
        double t1b= z1;// 10.0
        short y1= (short) z1;// explicit casting



    }


}
