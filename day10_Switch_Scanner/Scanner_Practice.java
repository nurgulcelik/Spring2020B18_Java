package day10_Switch_Scanner;
import java.util.Scanner;
public class Scanner_Practice {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter your first number: ");
       byte num1= input.nextByte();// short num1= input.nextShort();
        System.out.println(" Enter your second number: ");
       byte num2= input.nextByte();// short num2= input.nextShort();
        System.out.println("The sum of those two numbers are: " + (num1 +num2));



    }
}
