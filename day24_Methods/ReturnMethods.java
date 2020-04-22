package day24_Methods;


import java.util.Arrays;

public class ReturnMethods {
    public static void maxNum(int a,int b){
        if(a>=b){
            System.out.println(a);

        }else{
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        int[] array={10,9,6,5,1,0};
        int result= addition(1000,20000);
        System.out.println(result);
       int result3 =multiplication(10,20,30);
        System.out.println(result3);
        maxNum(10,20);
        int max= MaximumNumber(array);
        System.out.println(max);
        int min=MinimumNumber(array);
        System.out.println(min);
    }
    public static int addition(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    public static int multiplication(int num1,int num2,int num3){
        int result1=num1*num2*num3;
        System.out.println(result1);
        return result1;
    }
    public static int MaximumNumber(int[] arr){
        Arrays.sort(arr);
       int max= arr[arr.length-1];
       return max;
    } public static int MinimumNumber(int[] arr){
        Arrays.sort(arr);
        int min= arr[0];
        return min;

    }
}
