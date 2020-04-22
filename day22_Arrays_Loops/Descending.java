package day22_Arrays_Loops;
import java.util.*;
public class Descending {
    public static void main(String[] args) {
      int[] arr= {10,78,2,-1,500,70};
        Arrays.sort(arr);//sorts in ascending order
        System.out.println(Arrays.toString(arr));

        int[] RevArr=new int[arr.length];
        //RevArr[0]=arr[4];RevArr[1]=arr[3];RevArr[2]=arr[2];RevArr[1]=arr[3];RevArr[4]=arr[0];
        int j=arr.length-1;
        for(int i=0;i<arr.length; i++){
            RevArr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));
int[] nums={7,2,5,9};
Arrays.sort(nums);
int[] revnums= new int[nums.length];
j=nums.length-1;
for(int i=0;i<nums.length;i++){
    revnums[i]=nums[j];
    j--;
}
        System.out.println(Arrays.toString(revnums));
    }
}
