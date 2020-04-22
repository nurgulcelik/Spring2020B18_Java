package day10_Switch_Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
     char ch='a';
     // or String result="";
     switch (ch){
         case 'A':
             System.out.println('A');// or result="A";
             break;
         case'B':
             System.out.println('B');//or result="B";//result +=B;
         break;
         case 'C':
             System.out.println("C");//or result="C"; //result +=C;
             break;
         case 'D':
             System.out.println("D");//or result="D";//result +=D;
             break;
         default:
             System.out.println("Invalid");//or result="Invalid";//result +="INVALID";//ABCDINVALID;



     }


    }


}
