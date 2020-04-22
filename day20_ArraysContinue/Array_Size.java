package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        //         0 1 2
       // System.out.println(arr[100]);indexoutofboundsexception
        int[] nums= new int[2];
        nums[0]=10;
        nums[1]=20;//nums[2]=30; array size is fixed
        System.out.println(nums[0]);
        System.out.println(nums[1]);
       // System.out.println(nums[2]);indexoutofboundexception
        nums = new int[3];//I have zero//reset,
        System.out.println(nums[0]);// 0,above condition,we have not give any value yet,give default value=0
        System.out.println(nums[1]);//0
        System.out.println(nums[2]);

    }


}
