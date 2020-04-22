package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {


        int number= 100;
       // boolean evenNum= number % 2==0;
        // if ( evenNum) { }



        if (number %2== 0){
            System.out.println(number + " is even number");
        } else { // otherwise

            System.out.println( number + " is odd number");

            }
        int age= 30;
        if ( age>= 21) {
            System.out.println("Here is your Vodka");
        } else{
            System.out.println(" Go home kid");
        }
        boolean testedPositiveForCorona= false;
        if ( testedPositiveForCorona){
            System.out.println(" Stay home");
        } else{
            System.out.println( " Come to work");
        }



        }


    }

