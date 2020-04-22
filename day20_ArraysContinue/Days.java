package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int attempts = 1;

        while(num > 7 || num <= 0) {
            System.out.println("Invalid entry");
            System.out.println("Please,re-enter a number");
            num = input.nextInt();
            attempts++;
            if(attempts==3 &&(num>7 || num<=0)){
                System.out.println("Invalid entry,you already have 3 attempts");
                System.exit(0);
            }
        }
        String result = days[num - 1];
        System.out.println(result);
    }
     }


