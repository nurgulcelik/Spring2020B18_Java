package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        //       0      1       2
        /*
        numbers[0]==>{9,8,7}//numbers[0][i],i repeated 3 times
        numbers[1]==>{6}//numbers[1][i],i repeated 1 time
        numbers[2]==>{5,4,3,2,1,0}//numbers[2][i],i repeated 6 times
         */
        for (int k = 0; k < numbers.length; k++) {
            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i] + " ");
            }
            System.out.println();
        }
        //output will be 7 8 9 6 0 1 2 3 4 5
        //                 0   1     2
        for (int k = 0; k < numbers.length; k++) {
            for (int i = numbers[k].length - 1; i >= 0; i--) {
                System.out.print(numbers[k][i] + " ");
            }
        }
        System.out.println();
        // output will be 5 4 3 2 1 0 6 9 8 7
        for (int k = numbers.length - 1; k >= 0; k--) {//k= index num of 1D arrays(reversed)
            for (int i = 0; i < numbers[k].length; i++) {//i=index num of the elements in 1D array
                System.out.print(numbers[k][i] + " ");
            }
        }
        System.out.println();
        //output will be O 1 2 3 4 5 6 7 8 9
        for (int k = numbers.length - 1; k >= 0; k--) {
            for (int i = numbers[k].length - 1; i >= 0; i--) {
                System.out.print(numbers[k][i] + " ");
            }
        }
        System.out.println();
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        for (int k = 0; k < nums.length; k++) {
            for (int i = nums[k].length - 1; i >= 0; i--) {
                System.out.print(nums[k][i] + " ");
            }
        }
        System.out.println();
        for(int k=0;k<nums.length; k++){
            for(int i=0;i<nums[k].length; i++){
                System.out.print(nums[k][i]+" ");
            }
        }
        System.out.println();
        for(int k=nums.length-1; k>=0;k--){
            for(int i=nums[k].length-1; i>=0; i--){
                System.out.print(nums[k][i]+" ");
            }
        }
    }



    }
