package dayInterview;
import java.util.*;
public class StringSumOfDigits {
    /*
    Write a method that can return the sum of the digits in a String
    Ex:"AB12C3D4"->10
     */
    public static void main(String[] args) {
      String str="AB23C4DE1";
        System.out.println(sumOfDigits(str));
    }
    public static int sumOfDigits(String str){
       int sum=0;
       char[] ch=str.toCharArray();
       for(char each:ch){
           if(Character.isDigit(each)){
               sum+=Integer.parseInt(""+each);
           }
       }
       return sum;
    }

}
