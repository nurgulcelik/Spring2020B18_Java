package day32_Predicate;
import java.util.*;
public class Uniques {
    public static void main(String[] args) {
        //write a program that can return the unique objects of characters
        Character[] chars = {'a', 'a', 'b', 'c', 'd', 'd'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>();
       /* for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(i));
            if (count == 1) {
                result.add(charList.get(i));
            }
        }*/
        for (Character each : charList) {
            int count = Collections.frequency(charList, each);
            if (count == 1) {
                result.add(each);
            }
            System.out.println(result);
        }
    }
}