package day17_WhileLoops;
/*
 1.write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will need for loop and if statement
 */

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNum = -1999999999;
        int minNum = 1999999999;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.println("Maximum number: " + maxNum);
        System.out.println("Minimum number: " + minNum);


        }


    }
