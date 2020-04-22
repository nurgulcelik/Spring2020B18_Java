package day02_Variables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Variables {
    public static void main(String[] args) {
        /*
        declare variables:
        DataType variableName= Data;
         */
        byte l= 4;
        byte w= 2;
        byte area= 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        // byte num= 2.5;  byte,short,int,long they only accept whole numbers
        // byte num1= 130; exceeds the range of byte
        // short num2 =3.5; exceeds the range of byte
        short num3 = 10000;
        // short num4 = 40000;
        System.out.println(num3); //100
        System.out.println(12345); // by default compiler takes it as int primitive
        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2);

       // long n3 = 9999999999; // out of int' range. compiler by default takes it as int

        long n4 = 9999999999l; // forcefully telling the compiler that this is too long data number, not int'
        System.out.println( n4 );
        System.out.println(9999999999l);
        long n5 = 19;
        // int num = 7l; larger cannot be assigned to smaller one
        // double> float> long> int> short> byte
        short s1 =10;
       // byte b1 =s1;// short is larger than byte
       int i1 = s1;
float f2 = 5.5f;
        System.out.println(f2);
        System.out.println("=============================================)");



        float pi = 3.14f;
        int a1 = 3000;
        double d2 = a1;

        System.out.println(d2);



    }
}
