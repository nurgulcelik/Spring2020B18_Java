package day06_Shorthnd_LogicalOperators;

public class exerciseForif {
    public static void main(String[] args) {
      double d= 20;
      double d1= 80;
      double x= (d +d1)*25;
        System.out.println(x);
        boolean  result1= true;

        double d2= x %40;
        if ( d2 ==20 || d2 <20){
            System.out.println( result1);
        }
        System.out.println("==============");
       int userAge= 18;

       if ( userAge > 18 || userAge==18){
           System.out.println(" You are eligible to vote");
       }
        System.out.println("======================");
       int num1= 4;
       int num2= 40;
       int num3= 15;
       if ( num1>num2 && num1>num3){
           System.out.println( " The greatest number is: " + num1);
       }
       if ( num2>num1 && num2>num3){
           System.out.println(" The greatest number is: " + num2);
       }
       if ( num3>num1 && num3>num2){
           System.out.println( " The greatest number is: " + num3);
       }
        System.out.println("=====================");
       int i1= 12;
       int i2= 12;
       boolean rslt= true;
       if ( i1==i2){
           System.out.println(rslt);
       }
        System.out.println("======================");
       int hour= 10;
       if ( hour < 12  ){
           System.out.println(" Good Morning");
       }
       if ( hour > 12 || hour ==12){
           System.out.println(" Good Afternoon");
       }
       if ( hour >3 || hour ==3){
           System.out.println(" Good Evening");
       }



    }
}
