package day34_CustomClass;
import java.util.*;
public class ObjectMemory {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> list2= list1;
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("================");
        String str1= new String ("cybertek");//one object
        String str2= str1;
        str1= str1.toUpperCase();//one object,all object store in the heap memory
        System.out.println(str1);
        System.out.println(str2);
        int i=100;// in the stack

    }
}
