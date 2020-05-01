package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MoveZero2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);
       int count= Collections.frequency(list,0);
        System.out.println(count);
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        for (int i = 0; i < count; i++) {
            list.add(0);//list.add(0,0) if you add at the beginning
        }
        System.out.println(list);
    }
}
