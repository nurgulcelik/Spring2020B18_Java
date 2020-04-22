package day17_WhileLoops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user yes or no,
        or other then yes or no repeat the previous question
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word=input.next();
        boolean valid=word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no");
        while(!valid){
            System.out.println("Please re-enter");
            word=input.next();
            if(word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no")){
                break;
            }
        }
        if(word.equalsIgnoreCase("yes")){
            System.out.println("Entered YES");
        }
        if(word.equalsIgnoreCase("no")){
            System.out.println("Entered NO");
        }
    }



}
