package day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a=100;//primitive
        Integer b= 200;//wrapper class
        short s1= 200;
        int n1= s1;
       //Integer n2=s1;Does not compile,Integer only accept int
  Integer n2=n1;
  //============================================
        int a1=20;
        float f1=a1;
        //Float f2=a1; Does not compile
        Integer i2=200;
        int a2=i2;
        Byte B1= 126;
        int a3= B1;
        System.out.println(a3);

    }
}
