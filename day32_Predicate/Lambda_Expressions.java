package day32_Predicate;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Predicate<Integer> oddNumber = x -> x % 2 != 0;
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("======================================");
        Predicate<Integer> lessThanFive = y -> y < 5;
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 8, 9, 10));
        list2.removeIf(lessThanFive);
        System.out.println(list2);
        Predicate<String> startsWithM = s -> s.startsWith("m");
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("mu", "mo", "bo", "sha", "bi"));
      list3.removeIf(startsWithM);
        System.out.println(list3);
//Predicate<String>startsWithMorA = each-> each.startsWith("m") ||each.startsWith("b");
        //list3.removeIf(startsWithMorA);
        System.out.println("===============================");
        Predicate<Character>digit= c-> Character.isDigit(c);
                //c->c>=48 && c<=57;
        ArrayList<Character>chars=  new ArrayList<>(Arrays.asList('a','b','3','4','&','@'));
        chars.removeIf(digit);
        System.out.println(chars);
        System.out.println("=====================================");
  Predicate<Integer> greaterThan5=p->p>5;
        ArrayList<Integer>nums= new ArrayList<>(Arrays.asList(1,2,3,5,6,7,8));
nums.removeIf(greaterThan5);
        System.out.println(nums);

    }
}