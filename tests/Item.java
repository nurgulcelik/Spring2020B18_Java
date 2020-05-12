package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    String name;
    double unitPrice;
    int quantity;
    public Item(String name,double unitPrice,int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public double calcCost(){
        return quantity*unitPrice;
    }
    public String toString(){
        return "Name of the item: "+name+" unit price: $"+unitPrice+
                " quantity: "+quantity+"\nTotal cost: $"+calcCost();
    }
}
class ShoppingList{
    public static void main(String[] args) {
        Item item1=new Item("Apple",3,2);
        Item item2=new Item("Pear",4,3);
        Item item3=new Item("Banana",2,3);
        Item item4=new Item("Tomatoes",3,5);
        Item item5=new Item("Grapes",6,2);
        double totalCost=0;
        ArrayList<Item>shoppingList=new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        for(Item each:shoppingList){
            System.out.println(each);
            totalCost +=each.calcCost();
        }
        System.out.println("Total cost of the shopping list: $"+ totalCost);
    }
}
