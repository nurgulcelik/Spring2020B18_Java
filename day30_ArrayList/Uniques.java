package day30_ArrayList;

import java.util.ArrayList;
/*
write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
//list.get(0)
        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {//for( Integer each2:list)
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {//each==each2
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));//uniques.add(each2)
            }
            System.out.println(count);
        }
        System.out.println(uniques);
    }
}