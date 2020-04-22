package day10_Switch_Scanner;

public class LocalVariable {

    public static void main(String[] args) {
     int a=0;
     //that are declared within the block,cannot be used outside the block
     //must be initialized before use them
       if (true){
           System.out.println(a);
           int b= 10;
       }
       // System.out.println(b); local variable cannot be used outside the block
switch(3){
    case 1:
        int c=100;

    case 2:
        //System.out.println(c);


}
    }

}
