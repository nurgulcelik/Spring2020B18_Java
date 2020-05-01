package day32_Predicate;
import java.util.*;
public class CollectionsMethod {
    public static void main(String[] args) {
      ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

      int max= Collections.max(list);

        System.out.println(max);
        int min= Collections.min(list);
        ArrayList<Integer>numbers= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4));
        Integer maxnum=Collections.max(numbers);
        numbers.removeAll(Arrays.asList(maxnum));
        System.out.println(numbers);
        int secondmax=Collections.max(numbers);
        System.out.println(secondmax);
        ArrayList<Integer>numbers1= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4));
        Integer minnum=Collections.min(numbers1);
        numbers.removeAll(Arrays.asList(maxnum));
        System.out.println(numbers);
        int secondmin=Collections.min(numbers1);
        System.out.println(secondmin);
        System.out.println("=========================================");
        ArrayList<Integer>numbers2= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.swap(numbers2,0,4);
        System.out.println(numbers2);
        ArrayList<String>names= new ArrayList<>(Arrays.asList("omer","omer","ayse","sha","omer"));
        Collections.replaceAll(names,"omer","irina");
        System.out.println(names);

    }
}
