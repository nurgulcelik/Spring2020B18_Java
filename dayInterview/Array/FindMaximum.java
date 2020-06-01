package dayInterview.Array;

import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr= {1,6,3,8,2,9,10,24,7};
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        System.out.println(max);
        int[] arr1={3,6,7,8,2};
        int max2=Integer.MIN_VALUE;
        int max1=arr1[0];
        for( int each:arr1){
            if(each>arr1[0]){
               max1=each;
            }
        }
        System.out.println(max1);
    }

}
