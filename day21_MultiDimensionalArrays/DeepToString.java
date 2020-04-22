package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
int[] arr1={1,2,3};
        System.out.println(Arrays.toString(arr1));
int[][]arr2D = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2D));
double[] num1={4,5,6,7};
double[] num2={2,8,10,20};
double[][] num3={{4,5,6,7},{2,8,10,20}};
        System.out.println(Arrays.deepToString(num3));
        System.out.println(Arrays.toString(num1));
        System.out.println(num3[0][1]);
        System.out.println(num3[1][3]);
        System.out.println(num1[0]);



} 
}
