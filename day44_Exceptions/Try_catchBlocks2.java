package day44_Exceptions;

public class Try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("hello");

        try{
            Thread.sleep(2000);//in two second print the second word
            System.out.println("try block");
        }catch(Exception e){
            System.out.println("catch block");
        }
        System.out.println("world");
    }
}
