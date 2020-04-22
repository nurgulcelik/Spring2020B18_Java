package day21_MultiDimensionalArrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {
       int[] arr ={1,2,3}; //store multiple data
        int[][] arr2D = { {1,2,3},{4,5,6 }};
  //                         0   ,    1
        System.out.println(arr2D.length);
        int[] arr1D  =  arr2D[0];
        System.out.println(Arrays.toString(arr2D[1]));
        int num1=arr2D[1][2];
        System.out.println(num1);
        int num2=arr2D[0][1];
        System.out.println(num2);
        //{'A','B'}      0   1   2     0    1   2    0   1    2
        char[][] ch2D={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        //index     row      0             1             2
        char c1=ch2D[1][1];
        System.out.println(ch2D[1][0]);
        System.out.println(ch2D[0][1]);
        System.out.println(c1);
        char[] ch2= ch2D[2];//g,h,i
        System.out.println(Arrays.toString(ch2));
        String[][] str2D={{"A","B","C"},{"D","E","F"},{"G","H","I"}};
        String sr1=str2D[2][0];
        System.out.println(sr1);
    }
}
