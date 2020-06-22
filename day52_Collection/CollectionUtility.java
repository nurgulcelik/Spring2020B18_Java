package day52_Collection;

import java.util.*;

public class CollectionUtility {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("=============================");
        //remove duplicate and print out in sorted ascending order,TreeSet
        ArrayList<Integer>nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,12,1,21,2,2,32,3,3,4,4,5));
       // TreeSet<Integer> sorted= new TreeSet<>(nums);
        //nums = new ArrayList<>(sorted);
        //System.out.println(nums);
        nums= new ArrayList<>(new TreeSet<>(nums));
        System.out.println("===========================");
        //remove the duplicate and do not change the order, linkedHashset
       // [6,6,6,6,5,5,5,4,4,4]==>[6,5,4]
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4));
        list = new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list);//[6,5,4]
        list = new ArrayList<>(new TreeSet<>(list));
        System.out.println(list);//[4,5,6]
        System.out.println("============================");
        ArrayList<String>letters= new ArrayList<>();
        letters.addAll(Arrays.asList("a","a","b","c","b"));
        boolean result= Collections.frequency(letters,"a")==1;
        System.out.println(result);//false
    }
}
