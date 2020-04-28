package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);//0
        list.add(7);//2
        list.add(8);//3
        //list.add(6);//add the object ,end of the array list
        list.add(1,6);//if we at the object at the specific place
        //list.add(7,10);//index out of bound
        list.set(3,9);// 9 will replace with 8
        System.out.println(list);//[5,6,7,9]
        int[] arr= {1,2,3,4};
        arr[3]=5;//1,2,5,4 in the array we use set
        System.out.println("===================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3


    }
}
