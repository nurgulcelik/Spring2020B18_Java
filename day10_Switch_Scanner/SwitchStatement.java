package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        byte a=4;// float,long,double, and boolean cannot except(4.5f;10l;2.5d;true or false
 switch (a){
     case 1:
         System.out.println("One");
         break;
     case 2:
         System.out.println("Two");
         break;
     default:
         System.out.println("Invalid case");
         break;
     case 3:
         System.out.println("Three");
         break;
     case 4:
         System.out.println("Four");
         break;
 }




    }


}
