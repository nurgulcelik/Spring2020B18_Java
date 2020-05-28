package day44_Exceptions;



public class finally_Block {
    public static void main(String[] args) {
    try{
        System.out.println(9/10);
        System.out.println("try block");
    }catch(Exception e){
        System.out.println("catch block");
    } finally{
        System.out.println("finally block");
    }
    }
}
