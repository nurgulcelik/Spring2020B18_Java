package day23_Methods;
import java.util.*;
public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();

        EligibleToBuyAlcohol(45);// if we use byte, we need to do explicit casting(byte)45
        EligibleToBuyAlcohol(18);
    }
    public static void EligibleToBuyAlcohol(int age){//byte age
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }

}
