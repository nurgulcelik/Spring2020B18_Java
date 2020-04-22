package day20_ArraysContinue;
import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String name="Nurgul";
        char[] ch= name.toCharArray();
        System.out.println(Arrays.toString(ch));
        String str1="Cybertek School";
        String str2="School Cybertek";
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
Arrays.sort(ch1);
Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);
    }
}
