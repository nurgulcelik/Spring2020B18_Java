package day18_nestedLoops;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class NestedLoopPractice{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue?");
            String answer = input.next();
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry,please re-enter the two number");
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you using the calculator");
                break;
            }
        }
        /* program room reservation;
        king bed;$120
        queen bed;$100
        single bed;$80 should ask which bedroom do you wanna reserve
        if user provided invalid entry;please re-enter
         */
    }




}
