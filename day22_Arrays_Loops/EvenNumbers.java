package day22_Arrays_Loops;
import java.util.Arrays;
/*
  Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array's each indexes
        3. use for each loop to print out all the even numbers.
                Must use continue statement
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;

            }
            System.out.print(each + " ");
            System.out.println();

        }
        int[] numbers2 = new int[62];

        for (int i =0; i <numbers2.length; i++) {
            numbers2[i] = i;
        }
        for (int each : numbers2) {
            if (each % 2 != 0) {
                continue;

            }
            System.out.print(each + " ");


        }


    }

}








