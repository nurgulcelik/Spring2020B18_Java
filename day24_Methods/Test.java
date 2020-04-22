package day24_Methods;
import java.util.*;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="Cybertek";
       String RevStr= Library.Reverse(str);
        System.out.println(RevStr);
        System.out.println(str.equalsIgnoreCase((RevStr)));
        int[] arr={1000,3000,2000,40000,500000,100000};
        arr=Library.sortDescending(arr);
        System.out.println(Arrays.toString (arr));
        String str2="Muhtar";
       String RevStr2=Library.Reverse(str2);
        System.out.println(RevStr2);
        int[] arr2={5,6,7,8,9};
        int[] DescArr2= Library.sortDescending(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
