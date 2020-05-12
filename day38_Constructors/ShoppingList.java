package day38_Constructors;



import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
       Item item1=new Item("toilet paper",15,3);
       Item item2=new Item("liquid soap",5,8);
       Item item3=new Item("detergent",12,2);
       Item item4=new Item("tea",8,7);
       Item item5=new Item("coffee",5,5);

        ArrayList<Item> shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));
        double totalCost=0;
        for(Item each:shoppingList){
            totalCost +=each.calcCost();
        }
        System.out.println("Total: $"+totalCost);
        // second way: for(int i=0;i<shoppingList.size();i++){
        // totalCost += shoppingList.get(i).calcCost();}
    }
}
