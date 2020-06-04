package OfficeHours.Practice_02_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayList {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
        System.out.println(SumOfNum(arr));
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(SumOfNum(list));
    }
    public static int SumOfNum(int[] arr){
        int sum=0;
        for(int each:arr){
            sum+=each;
        }
        return sum;
    }
    public static int SumOfNum(ArrayList<Integer>list){
        int sum=0;
        for(int i=0; i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

}
