package day20_ArraysContinue;
import java.util.Arrays;
public class Arrays_Equal {
    public static void main(String[] args) {
    int[] arr1={1,2,3};
    int[] arr2={1,2,3};
        boolean result1=Arrays.equals(arr1,arr2);
        System.out.println(result1);
        int[] arr3={3,2,1};
        int[] arr4={2,1,3};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        boolean result2= Arrays.equals(arr3,arr4);
        System.out.println(result2);
    }
}
