package OfficeHours.Practice_02_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
   /*
   5) Create a method that will accept an ArrayList of Strings and return
    the String that has the biggest length
    */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ZEYNEP","ENES","TALHA","NURGUL"));
        String str = longestString(list);
        System.out.println(str);
    }
    public static String longestString(ArrayList<String>list){
        String longest = list.get(0);
        for(int  i = 0; i < list.size(); i++){
            if(longest.length() < list.get(i).length()){
                longest = list.get(i);
            }
        }
        return longest;
    }
}
