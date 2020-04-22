package day15_ForLoop;

public class ForLoopPractice {
// odd number between1~100 in a single line
    public static void main(String[] args) {
String resultOdd="";
     for (int num=1; num<=100; num+=2) {
        // System.out.print(num+" ");
         resultOdd= resultOdd+ num+" ";
     }
        System.out.println(resultOdd);
     String resultEven="";
     for(int num1=0;num1<=100;num1+=2 ){
         resultEven+=num1+" ";
     }
        System.out.println(resultEven);




    }



}
