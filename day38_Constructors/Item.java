package day38_Constructors;
/*
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calcCost(){
        return quantity*unitPrice;
    }
    public String toString(){
        return "Name of the item: "+name+" unit price: $"+unitPrice+
                " quantity: "+quantity+"\nTotal cost: $"+calcCost();
    }
}
