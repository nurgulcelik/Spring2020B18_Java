package day31_BulkOperataions;
import java.util.ArrayList;
import java.util.Arrays;
public class Bulk_RemoveAll {
    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,3,3,3,3));
        //Integer a=1;
        //list.remove(a);
        //list.remove(a);
        //Integer[] arr={3,1,5,8};//list.removeAll(Arrays.asList());
        list.removeAll(Arrays.asList(3));
        System.out.println(list);
        System.out.println("======================");
        String[] names={"ahmet","ayse","fatma","zehra","ahmet"};
        ArrayList<String>nameList=new ArrayList<>(Arrays.asList(names));
        nameList.removeAll(Arrays.asList("ahmet"));
        System.out.println(nameList);//[ayse,fatma,zehra]

    }
}
