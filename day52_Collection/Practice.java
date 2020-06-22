package day52_Collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice {
    /*1. write a program that can remove the duplicated characters from String
     2.write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"
            str2 ="ab";
            output: true

     */
    public static void main(String[] args) {
        String str= "ABABABCDEF";//["A","B","C","D","E","F"]
        String[] arr= str.split("");//first way
       // LinkedHashSet<String>ls = new LinkedHashSet<>(Arrays.asList(arr));
       /* System.out.println(ls);
        String result="";
        for(String each:ls){
            result +=each;
        }
        System.out.println(result);*/
       //second way
       str="";
      // new LinkedHashSet<>(Arrays.asList(arr));
       for(String each : new LinkedHashSet<>(Arrays.asList(arr))){
           str+=each;
       }
        System.out.println(str);
        System.out.println("=====================================");
       /* String str1="abababab";
        String str2= "baba";
        String[] arr1= str1.split("");
        String[] arr2= str2.split("");
        TreeSet<String>t1 = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String>t2= new TreeSet(Arrays.asList(arr2));
        System.out.println(t1);
        System.out.println(t2);
        str1= t1.toString();
        str2=t2.toString();
        System.out.println(str1.equals(str2));//true
       */
        String str1="abababab";
        String str2= "baba";
       str1= new TreeSet<>(Arrays.asList(str1.split(""))).toString();
       str2= new TreeSet<>(Arrays.asList(str1.split(""))).toString();
       System.out.println(str1.equals(str2));
    }

}
