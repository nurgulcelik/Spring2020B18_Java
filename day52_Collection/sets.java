package day52_Collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {
       // Set<String>names= new HashSet<>();
        Set<String>names= new LinkedHashSet<>();
        names.add("zeynep");
        names.add("zeynep");
        names.add("zeynep");
        names.add("enes");
        names.add("talha");
        System.out.println(names);
        String[] arr= {"a","b","c","a","b"};
        LinkedHashSet<String> set1= new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);//[a,b,c]
        //System.out.println(set1.get(1));
        System.out.println("===========================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10,9,8,7,6,5,6));
        System.out.println(numbers);

    }
}
