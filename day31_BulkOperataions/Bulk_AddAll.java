package day31_BulkOperataions;
import java.util.*;
public class Bulk_AddAll {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40));
        Integer[] arr= {10,20,30,40};//array list does not support primitive
        list.addAll(Arrays.asList(arr));
        System.out.println(list);
        System.out.println("==============================");
        String[] names= {"ay","se","ze","nu","se"};
        //names[5]="os";
        System.out.println(Arrays.toString(names));
        ArrayList<String> nameList= new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        nameList.add("os");
        nameList.remove("se");
        System.out.println(nameList);
        System.out.println("============================");
        Integer[] numbers= {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList= new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);
    }
}
