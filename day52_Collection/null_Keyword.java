package day52_Collection;

import java.util.ArrayList;

public class null_Keyword {
    static String str= new String("Cybertek");
    static ArrayList<Integer> list;//null
    public static void main(String[] args) {
        System.out.println(str.charAt(0));
        //System.out.println(list.get(1));nullpointerexception
    //int num=null;compile error

        ArrayList<String>list1= new ArrayList<>();
        list1.add(null);
        System.out.println(list1);//[null]
        System.out.println("==================================");
        String number = "123";
        int num1= Integer.parseInt(number);
     //   System.out.println(num1); exception
        System.out.println("=================================");
        String[] arr ={null,"Cybertek",null};//length=3, one object is created
       // arr[2].toUpperCase();
        String name1= "cybertek".toUpperCase();
        name1=null;
        //name1=name1.toLowerCase();
        System.out.println(name1);


    }
}
