package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        int[] n=new int[3];
        n[0]=0;
        n[1]=1;
        n[2]=2;
        String[]months={"january","february","march","april","may","june","july","august","september","october","november","december"};
        //String[] months2=new String[12];
        //months2[0]="january";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        //size of months 12;max num=11;//max num can be 11;
        while(num>12 || num<=0){
            System.out.println("Invalid entry");
            System.out.println("Please,re-enter a number");
            num=input.nextInt();
        }
        String result =  months[num-1];
        System.out.println(result);




    }
}
