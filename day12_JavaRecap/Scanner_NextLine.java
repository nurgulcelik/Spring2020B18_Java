package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter some number: ");//enter
        int num= input.nextInt();//13
        System.out.println(num);
        input.nextLine();//enter //used for taking out the enter
        System.out.println("Enter your name: ");
        String name= input.nextLine();









    }


}
