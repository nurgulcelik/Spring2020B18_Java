package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer>list1=  new ArrayList<>();
        list1.add(1);
        List<Integer>list2= new LinkedList<>();
        list2.add(2);
        System.out.println("=====================");
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(2);

        Vector<Integer> vectorList= new Vector<>();
        vectorList.add(6);
     Stack<Integer> stack= new Stack<>();
     stack.add(10);
     Stack<String>names= new Stack<>();
     names.add("zeynep");
        names.add("enes");
        names.add("talha");
        names.add("veysel");
        names.add("arslan");
        System.out.println(names);//zeynep,enes,talha,veysel,arslan
       String s1= names.pop();
        System.out.println(s1);//arslan
        System.out.println(names);//zeynep,enes,talha,veysel
       String s2= names.pop();//veysel
        System.out.println(s2);
        System.out.println(names);//zeynep,enes,talha
        names.push("nurgul");
        System.out.println(names);

    }

}
