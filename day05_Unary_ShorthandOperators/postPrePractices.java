package day05_Unary_ShorthandOperators;

public class postPrePractices {
    public static void main(String[] args) {
   int a= 50;
   a= --a+a++ +a-- + a++;
   // 49+49+50+49
        System.out.println(a);

        int x=4;
        int y= x* 4- x++;
        System.out.println(y);
        int a1=1;
        a1= -a1-- + a1++ / -a1-- * --a1;
        //-1 + 0  / -1 * -1
        System.out.println(a1);

        System.out.println( "result a" +0+1);
        System.out.println("5+2" +0+1);
        System.out.println("5+2=" +(1+2));
        long a5=30l;
        long b5= (short)a5;
        System.out.println(b5);



    }



}
