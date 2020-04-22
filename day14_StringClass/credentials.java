package day14_StringClass;

import java.util.Scanner;

/*
userName=cybertek
passWord=cybertekschool
 */
public class credentials {
    public static void main(String[] args) {
        String validUserName="cybertek";
        String validPassWord="cybertekschool";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String inputUserName= input.next();
        System.out.println("Enter your password: ");
        String inputUserPassWord= input.next();
        boolean validCredentials=inputUserName.equals(validUserName)&&inputUserPassWord.equals(validPassWord);
        if (validCredentials){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }




    }
}
