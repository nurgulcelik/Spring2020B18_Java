package day32_Predicate;
import java.util.*;
public class Duplicates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "A", "B", "C"));
        ArrayList<String> result = new ArrayList<>();
        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count > 1) {
                if(result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }
        System.out.println(result);
    }
}