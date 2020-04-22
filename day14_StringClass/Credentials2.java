package day14_StringClass;

import java.util.Scanner;
/*username and password can not be empty
  valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
 */

public class Credentials2 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter your username: ");
        String inputUserName= input.nextLine();
        System.out.println("Enter your password; ");
        String inputPassWord= input.nextLine();
        boolean loggedIn=inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        boolean invalidUserName= !inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        boolean invalidPassWord= inputUserName.equals("Cybertek") && !inputPassWord.equals("cybertekschool");
        if(!inputUserName.isEmpty() && !inputPassWord.isEmpty()){
           if (loggedIn){
               System.out.println("Logged in");
           } else if(invalidUserName){
               System.out.println("Password is correct, username is not correct");
           }else if (invalidPassWord){
               System.out.println("Password is incorrect, username is correct");
           }else{
               System.out.println("Both username and password are incorrect");
           }

        }else{
            System.out.println("Please,enter the credentials");
        }



    }
}
