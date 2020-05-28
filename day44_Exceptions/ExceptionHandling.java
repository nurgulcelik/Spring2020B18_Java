package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str="Cybertek";
        try{
            System.out.println(str.charAt(100));
        }catch(RuntimeException e){
            String description= e.getMessage();//return the brief description
            System.out.println(description);
        }
        System.out.println("=================================");
        String description="";
        try {
            System.out.println(100 / 0);
        }catch(ArithmeticException e){//e local variable

             description= e.getMessage();// / BY ZERO
        }
        System.out.println(description);
        System.out.println("completed");
    }
}
