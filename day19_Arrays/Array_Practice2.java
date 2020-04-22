package day19_Arrays;

import java.util.Scanner;

public class Array_Practice2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        System.out.println(arr.length);//3
        int[] arr2 = new int[5];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        String[] Testers = new String[3];//"Reem","Madina","Osman"
        Testers[0] = "Reem";
        Testers[2] = "Osman";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);
        System.out.println(Testers.length);
        System.out.println("======================================");
        String[] students = new String[10];
        Scanner input = new Scanner(System.in);

            for (int i = 0; i <= 9; i++) {
                System.out.println("Enter a name");
                students[i] = input.next();

            }
            System.out.print(students[0] +" "+students[1]+" "+students[2]+" ");
            System.out.print(students[3]+" "+students[4]+" "+students[5]+" ");
            System.out.print(students[6]+" "+students[7]+" "+students[8]+" ");
            System.out.print(students[9]);



    }
}
