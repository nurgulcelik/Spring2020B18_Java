package OfficeHours.Practice_02_06_2020;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArray_ArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(Reversed(arr)));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(Reversed(list));
    }
    public static int[] Reversed(int[] arr){
        int[] reversed= new int[arr.length];
        int j=0;
        for(int i =arr.length-1; i>=0;i--) {
            reversed[j]= arr[i];
            j++;
        }
        return reversed;
    }
    public static ArrayList<Integer> Reversed(ArrayList<Integer> list){
        ArrayList<Integer> reversed= new ArrayList() ;

            for(int i=list.size()-1; i>=0;i--) {
                reversed.add(list.get(i));
        }
        return reversed;
    }
}
