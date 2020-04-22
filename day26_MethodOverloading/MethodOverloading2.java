package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        int[] arr={5,4,3,2};
        Arrays.sort(arr);

    }
    public static void sum(int num1,int num2){
       int sum= num1+num2;
        System.out.println(sum);
    }
    public static void sum(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println(sum);
    }
    public static void sum(int num1,int num2,int num3,int num4){
        int sum= num1+num2+num3+num4;
        System.out.println(sum);
    }

}
