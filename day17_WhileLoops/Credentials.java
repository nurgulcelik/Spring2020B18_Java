package day17_WhileLoops;

import java.util.Scanner;

// username;cybertek,password:cybertek123
public class Credentials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter user name");
        String username= input.next();
        System.out.println("Enter pass word");
        String password= input.next();
        int count=1;
        while(!(username.equals("cybertek") && password.equals("cybertek123"))){
            System.out.println("Please re-enter those credentials");
            System.out.println("Enter user name");
            username=input.next();
            System.out.println("Enter pass word");
            password=input.next();

            count++;
            if(count==3 && !(username.equals("cybertek") && password.equals("cybertek123"))){
                System.out.println("Your account is locked");
                break;
            }

        }
        //System.out.println("Logged in");
        if((username.equals("cybertek") && password.equals("cybertek123"))){
            System.out.println("Logged in");
        }
    }
}
