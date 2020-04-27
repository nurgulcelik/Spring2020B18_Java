package day29_Wrapper_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str= "123";
        Integer a= Integer.valueOf(str);
        System.out.println(a+1);
        byte c=10;
       // Integer b=c; not compile
        double b= Integer.valueOf(str);//unboxing
        // double==> Integer
        System.out.println(b);//123.0 decimal number
        String str2= "15.5";
        double d1 = Double.parseDouble(str2);
        // return me primitive double==>double none
        double d2= Double.valueOf(str2);//15.5
        // double== Double unboxing return me wrapper class
        System.out.println(d1);//15.5
        System.out.println(d2);//15.5
        System.out.println(d1==d2);//true
        System.out.println("======================================");
        int z1= 2000;
        //Long L1= z1; does accept only Long, not compile
        Short s1= 3000;
        int z2= s1;
        String r1= "true";//today is monday,return false
        // tRuE,is not case sensitive
        Boolean t1= Boolean.valueOf(r1);//Boolean,true
        boolean t2= Boolean.valueOf(r1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("===========================");
        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);
        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);
        int minNum= Integer.MIN_VALUE;
        System.out.println(minNum);
        byte maxNum3= Byte.MAX_VALUE;//127
        byte minNum3=Byte.MIN_VALUE;//-128 //E means 10 in the num
        System.out.println("===================================");
        double[] arr= new double[3];
        System.out.println(Arrays.toString(arr));//[0.0,0.0,0.0] default value of boolean false
        Boolean[] arr2= new Boolean[3];//[null,null,null]
        System.out.println(Arrays.toString(arr2));
    }
}
