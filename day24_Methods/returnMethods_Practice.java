package day24_Methods;
import java.util.*;
public class returnMethods_Practice {
    public static void main(String[] args) {
        int[] arr = {9, -8, 7, -6};
        int max = MaxNumber(arr);
        System.out.println(max);
        int min = MinNumber(arr);
        System.out.println(min);


    }

    public static int MaxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int MinNumber(int[] arr) {
        Arrays.sort(arr);

        return arr[0];
    }



    }
