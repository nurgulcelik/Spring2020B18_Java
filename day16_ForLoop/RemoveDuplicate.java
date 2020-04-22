package day16_ForLoop;

import java.util.Scanner;

// interview question
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
      
      //            0123
      String result="";
        for( int i=0; i<=str.length()-1; i++){
            /*
            if(!result.contains(""+str.charAt(i)){
            result+=str.charAt(i);
        }
        */
           if(result.contains(""+str.charAt(i))){
               continue;
            }
           result+=str.charAt(i);

        }
        System.out.println(result);

    }



}
