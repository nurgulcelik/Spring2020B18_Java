package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);//enter
        // 7925 JonesBranch Dr, McLean VA,22034

        System.out.println("Building Number: ");

        int Bnumber= input.nextInt();//7925
        System.out.println("Building number is: "+ Bnumber);
        input.nextLine();
        System.out.println("Street: ");
        String street= input.nextLine();
        System.out.println("Street is: "+ street);
        System.out.println("Enter the zip code: ");
        int zipCode= input.nextInt();
        input.nextLine();
        System.out.println("Enter the city name and state  seperated by comma and space");
      String cityState = input.nextLine();
      String fullAddress= Bnumber +" "+ street+" "+", \n"+cityState+" "+zipCode;
        System.out.println(fullAddress);
        input.close();// closes the scanner




    }
}
