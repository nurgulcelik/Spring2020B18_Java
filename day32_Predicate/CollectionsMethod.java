package day32_Predicate;
import java.util.*;
public class CollectionsMethod {
    public static void main(String[] args) {
      ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

      int max= Collections.max(list);

        System.out.println(max);
        int min= Collections.min(list);
    }
}
