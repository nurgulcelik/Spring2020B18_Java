package day33_CustomClass;

import java.util.Scanner;

public class Pizza {
   String size;
   int numberOfCheeseTopping;
   int numberOfPepperoniTopping;

   public void customizeOrder(String size,int numberOfCheeseTopping,int numberOfPepperoniTopping){
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




    public static void main(String[] args) {

    }
}
