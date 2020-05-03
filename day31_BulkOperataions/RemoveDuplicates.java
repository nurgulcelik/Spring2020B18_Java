package day31_BulkOperataions;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
  ArrayList<Integer> list= new ArrayList<>();
  //remove duplicate from Array list
  list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        ArrayList<Integer> result= new ArrayList<>();
        for(Integer each: list){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);//[1,2,3]
        System.out.println("=========================");
        // remove duplicate from array of integer
        int[] arr={1,1,2,2,3,3};
        ArrayList<Integer> nonDup = new ArrayList<>();
        for( int i=0; i< arr.length; i++){
            if(!nonDup.contains(arr[i])){
                nonDup.add(arr[i]);
            }
        }
        System.out.println(nonDup);


    }
}
