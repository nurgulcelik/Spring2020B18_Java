package day24_Methods;
/*
create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
import java.util.*;
public class TaskFromYesterday {
    public static void MaxNumber(int[] array){
      Arrays.sort(array);
        System.out.println("Maximum number is: "+array [array.length-1]);

    }
    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println("Minimum number is: "+array[0]);
    }
    public static void Descending(int[] array){
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr={10,8,9,5,4,3,2,1};
        MaxNumber(arr);
        MinNumber(arr);
        int[] arr2={100,90,45,20,56,43,22,11,90};
        MaxNumber(arr2);
        MinNumber(arr2);
        int[] arr3={10,2,3,4,2,1,7};
        Descending(arr3);
    }
}
