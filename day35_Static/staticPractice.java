package day35_Static;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class staticPractice {
//when to use static variable instead of instance
static Scanner scan= new Scanner(System.in);//static is common

public static void main(String[] args) {
   // Scanner scan= new Scanner(System.in);
    System.out.println("Enter num1");
    int num1= scan.nextInt();
    System.out.println("Enter num2");
    int num2= scan.nextInt();
    System.out.println("sum is: "+(num1+num2));
}
public void method1(){
    //Scanner scan= new Scanner(System.in);
    System.out.println("Enter num1");
    int num1= scan.nextInt();
    System.out.println("Enter num2");
    int num2= scan.nextInt();
    System.out.println("multiplication is: "+(num1*num2));

}

}
