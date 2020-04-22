package day22_Arrays_Loops;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number
        int countOdd=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int[] each1DArray : numbers) {
            for(int eachElement: each1DArray){
                if(eachElement %2==0){
                    System.out.print(eachElement+" ");
                    sumOfEven+=eachElement;
                }else{
                    sumOfOdd+= eachElement;
                    countOdd++;
            }
        }



            }
            System.out.println();
            System.out.println(countOdd);
            System.out.println("Sum of even numbers: "+sumOfEven);
        }
    }
