package day30_ArrayList;
import java.util.*;
public class Task {
    public static void main(String[] args) {//task 1
        String str = "a1b2c3";
        char[] ch = str.toCharArray();
        int sum = 0;
        for (char each : ch) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
        System.out.println("=======================");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 3, 5));
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int each : list) {
                if (each == list.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(list.get(i));
            }
        }
        System.out.println(unique);//[2,4,5]
        System.out.println("==========================");//task 3
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int k = list2.size() - 1; k >= 0; k--) {
            reversed.add(list2.get(k));
        }
        System.out.println(reversed);//[5,4,3,2,1]
        System.out.println("======================");
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        ArrayList<Integer> uniques = new ArrayList<>();
        for (int k = 0; k < arr.length; k++) {
            int count = 0;
            for (int each : arr) {
                if (each == arr[k]) {
                    count++;
                }
            }
                if (count == 1) {
                    uniques.add(arr[k]);
                }
            }
            System.out.println(uniques);//[2,4,5]
        System.out.println("===============================");
        String[] str1={"a","b","c"};
        String[] str2={"d","e","f","g"};
        ArrayList<String>combineArray= new ArrayList<>();
        for(String each:str1){
            combineArray.add(each);
        }
        for(String each:str2){
            combineArray.add(each);
        }
        System.out.println(combineArray);//[a,b,c,d,e,f,g]


        }
    }











