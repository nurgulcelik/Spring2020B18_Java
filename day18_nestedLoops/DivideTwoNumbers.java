package day18_nestedLoops;
/*
 write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
			10/3=3 with a remainder
			a=a-b=7;
			a=a-b=4;
			a=a-b=1; count the execution;3, remainder;1
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 15;//15-3-3-3-3-3=0
        int b = 3;
        if (b == 0) {
            System.out.println("b cannot be zero");
            System.exit(0);
        }
        int count = 0;//count the execution of the loop
        while (a >= b) {
            a -= b;
            count++;
        }
        if (a == 0) {
            System.out.println("The result is: " + count);
        } else {
            System.out.println("The result is: " + count + "with a remainder of " + a);


        }
    }
}