package day32_Predicate;
import java.util.*;
public class MoveZeros {
    /*
    	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);
        int count = 0;
        for (Integer each : list) {// finding the frequency of zero
            if (each == 0) {
                count++;
            }
        }
        System.out.println(count);
        list.removeAll(Arrays.asList(0));//remove the all of the zero
        System.out.println(list);//[1,2,3,4]
        for (int i = 0; i < count; i++) {
            list.add(0);//list.add(0,0) if you add at the beginning
        }
        System.out.println(list);//[1,2,3,4,0,0,0,0];//add all of the zero
    }
}
