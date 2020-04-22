package day08_IfStatements;
/*
Multi branch if statement (else if) : if there are more than two possibilities, or option
            if(Condition1){
                    statement1;  // gets executed if condition1 is true
            } else if(condition2){
                    statement2; // gets executed if condition1 is false and condition2 is true
            } else {  // other wise
                    statement3;  // gtes executed if all condition1 & 2 are failed
            }
    ONLY ONE OF THE BLOCK GETS EXECUTED

 */
public class MultiBranchIf {
    public static void main(String[] args) {
        int a=100;
        /*
        boolean zero= a==0;
        boolean negative = a<0;
        boolean positive = a>0;
        if ( zero){
            System.out.println("zero");
        }
        if (negative){
            System.out.println(" Negative");
        }
        if ( positive){
            System.out.println( "Positive");
        }
        */
        if ( a==0) {
            System.out.println("zero");
        } else if ( a >0){
            System.out.println( "Positive");
        }else{
            System.out.println("Negative");
        }

    }
}
