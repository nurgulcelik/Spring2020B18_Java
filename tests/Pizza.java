package tests;
import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    String size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;

    public Pizza(String size,int numberOfCheeseTopping,int numberOfPepperoniTopping){
        this.size=size;
        this.numberOfCheeseTopping=numberOfCheeseTopping;
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }
    public double calcCost(){

        if(size.equalsIgnoreCase("small")){
            return 10 + 1.5*numberOfPepperoniTopping+ 1*numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium")){
            return 12+ 1.5*numberOfPepperoniTopping+ 1*numberOfCheeseTopping;
        }else{
            return 14 + 1.5*numberOfPepperoniTopping+ 1*numberOfCheeseTopping;
        }


    }
    public String toString() {
        String result =  size+" pizza " + numberOfPepperoniTopping +
                " number of Pepperoni topping " + numberOfCheeseTopping+" number of Cheese topping "+
                "\nTotal Price: $" + calcCost();
        return result;
    }

}
class Order{
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("small", 2, 3);
        Pizza pizza2 = new Pizza("medium", 4, 3);
        Pizza pizza3 = new Pizza("large", 4, 4);
        Pizza pizza4 = new Pizza("medium", 5, 5);
        Pizza pizza5 = new Pizza("large", 4, 3);

        ArrayList<Pizza>pizzaOrder= new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
        double total=0;
        for(Pizza each:pizzaOrder){
            total+=each.calcCost();
            System.out.println( each);

        }
        System.out.println("Order Total price: $"+total);


    }
}
