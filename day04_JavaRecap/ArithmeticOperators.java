package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {
int a= 10/3; //3
        System.out.println(a);//3
        System.out.println(10/4);//2
        double d=10/4;//2.0
        System.out.println(d);
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10.0/4.0);//2.5
        float f1= 10/4;//2
        System.out.println(f1);
        System.out.println(10/4f);
        //remainder= numerator-( denominator*the result of the whole number)
//10/4=2.5; remainder= 10-(4*2)=2
        System.out.println(10%4);
        System.out.println(15%3);
        // 15-(3*5)=0
boolean evenNumber= 25%2== 0;
        System.out.println(evenNumber);//false
        System.out.println(25%2);
        boolean oddNumber= 22% 2!=0;
        System.out.println(oddNumber);
        System.out.println(22%2);
        System.out.println(10%2==0);//true 10 is even number
        System.out.println(11%2!=0);//true 11 is odd number
        System.out.println("10 is even number:" + ( 10% 2== 0));
        System.out.println("11 is even number:" + ( 11% 2 ==0) );
        System.out.println("25 is odd number:"+ (25% 2 != 0));
        System.out.println("25 is even number: " +(25 %2== 0));
    }



}
