package day45_Exceptions;
class BreakTimeException extends RuntimeException{//CUSTOM UNCHECKED EXCEPTION
    public BreakTimeException(){
        super("It is a break time, we should take a break");
    }
    public BreakTimeException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        boolean breakTime= true;
        if(breakTime){
            throw  new BreakTimeException("Let's have a break now");
        }else{
            System.out.println("Continue the class");
        }
       // throw new RuntimeException("It is a break time, we should take a break ");
    }

}
