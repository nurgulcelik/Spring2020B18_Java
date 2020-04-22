package day18_nestedLoops;

import java.util.Scanner;

/*
 write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");//5,4,3,2,1
        long num=scan.nextInt();
        long result=1;//5*4*3*2*1
        while(num>=1){
            result*=num;
            num--;
        }
        System.out.println(result);
        int result1=1;
int num2=scan.nextInt();
     for(;num2>=1;num2--){
         result1*=num2;
     }
        System.out.println(result1);


    }
}
