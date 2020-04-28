package day30_ArrayList;
/*
 write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */
import java.util.*;
public class ArrayList_Reverse {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=1;i<6;i++){
          list.add(i);
      }
        System.out.println(list);
        ArrayList<Integer>reversedlist = new ArrayList<>();
      for(int i= list.size()-1;i>=0;i--){
          int eachNum= list.get(i);
          reversedlist.add(eachNum);

      }
        System.out.println(reversedlist);
    }
}
