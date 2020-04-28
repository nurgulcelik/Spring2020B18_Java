package day30_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");//0
        list.add("B");//1
        list.add("C");//2
       // list.remove(1);
        String str="B";
        //list.remove(str);//true//only one remove,first one
        boolean r2= list.remove("F");//FALSE
        boolean r1= list.remove(str);//true
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(list);
        list.clear();//size become 0
        System.out.println(list);//[]
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);//0
        list1.add(1);//1
        list1.add(2);//2
        list1.add(3);//3
        int num1= list1.indexOf(1);//Integer==>int autoboxing,first matching one
        System.out.println(num1);//0
        int num2= list1.indexOf(100);//-1 if the num is not exist
        System.out.println(num2);
    }
}
