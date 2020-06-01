package dayInterview.Array;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
      int[] arr1={1,2,3,4};
      int[] arr2={5,6,7,8};
        System.out.println(Arrays.toString(CombineArray(arr1,arr2)));
    }
    public static int[] CombineArray(int[] arr1,int[] arr2){
        int[] combine=new int[arr1.length+arr2.length];
        int i=0;
        for(int each:arr1){
            combine[i] =each;
            i++;
        }
        for(int each:arr2){
            combine[i]=each;
            i++;
        }
        return combine;
    }
}
