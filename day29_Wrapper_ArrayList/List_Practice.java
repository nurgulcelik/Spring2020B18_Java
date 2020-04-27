package day29_Wrapper_ArrayList;
import java.util.*;
public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("eggs");
        System.out.println(shoppingList);
        for(int i=0;i<shoppingList.size();i++){
            System.out.println(shoppingList.get(i));
        }
        //System.out.println(shoppingList.get(0));//milk
        //System.out.println(shoppingList.get(1));
        System.out.println("========================");
        for(String each: shoppingList){//4 time will be executed
            System.out.println(each);
        }
       int size= shoppingList.size();
        System.out.println(size);
        int lastIndex= shoppingList.size()-1;
        System.out.println(lastIndex);//4
    }
}
