package day10_Switch_Scanner;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //Scanner variableName= new Scanner(System.in);
        Scanner input =new Scanner(System.in);


        System.out.println(" Enter a byte number: ");
        byte num1= input.nextByte();
        System.out.println("You have entered" + num1);
        System.out.println(num1);



    }
}
