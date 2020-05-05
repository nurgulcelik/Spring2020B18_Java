package day33_CustomClass;

public class pizzaObjects {
    public static void main(String[] args) {
        Pizza order=new Pizza();
        order.size="small";
        order.numberOfCheeseTopping=3;
        order.numberOfPepperoniTopping=2;
        System.out.println(order);
    }
}
