package day22_Arrays_Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class nested_ForEach {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        for(int each:arr){
            System.out.println(each);
            int[][] arr2D= { {1,2,3},{4,5,6}};
            for( int[] each1Darray: arr2D){
                for(int eachElement: each1Darray){
                    System.out.println(eachElement);
                }

            }
            System.out.println("===================");
            char[][] ch2D={{'A','B'},{'C','D','E'}};
            for(char[] each1DArray : ch2D){
               // System.out.println(Arrays.toString(each1DArray));
                for(char eachElement: each1DArray){
                    System.out.println(eachElement);
                }
            }
        }
    }
}
