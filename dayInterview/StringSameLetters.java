package dayInterview;

import java.util.*;

public class StringSameLetters {
    /*
    Write a return method that check if a string is build out of the same leeters
    ex: ("abc","cba"->true)
     */
    public static void main(String[] args) {

        String str1="ABCD";
        String str2="DBAC";
        boolean result=same(str1,str2);
        System.out.println(result);
    }
    public static boolean same(String str1,String str2){
      char[] ch1= str1.toCharArray();
      char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String result1="",result2="";
        for(char each:ch1){
            result1+=each;
        }
        for(char each:ch2){
            result2+=each;
        }
        return result1.equals(result2);
    }
}
