package day13_StringClass;

import java.util.Scanner;

/*
 write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the building number: ");
     String buildingNum = input.next();//1120A enter
        input.nextLine();
        System.out.println("Enter the street address: ");
        String street= input.nextLine();
        System.out.println("Enter the city name: ");
        String city= input.nextLine();
        System.out.println("Enter the state name: ");
        String state= input.nextLine();
        System.out.println("Enter the zip code: ");
        String zipCode=input.next();
        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();
        String result="Ship to: "+fullName+"\n\t\t"+buildingNum+" "+street+"\n\t\t"+city+","+" "+state+" "+zipCode;
        System.out.println(result);




    }
}
