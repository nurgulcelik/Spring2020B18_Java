package day05_Unary_ShorthandOperators;

public class Divisibilty {
    public static void main(String[] args) {
    int number=65;
    boolean divisibleBy2 = number % 2==0;
    // the number can be divided by 2 without any remainder
        boolean divisibleBy3 = number % 3==0;
        // the number can be divided by 3 without any remainder
        boolean divisibleBy5 = number % 5 ==0;
        // the number can be divided by 5 without any remainder
        String result1 = number + " is divisible by 2: " + divisibleBy2;
        System.out.println(result1);
 String result2 = number + " is divisible by 3: " + divisibleBy3;
        System.out.println(result2);
        String result3 = number + " is divisible by 5: " + divisibleBy5;
        System.out.println(result3);
        System.out.println( result1 + "\n"+ result2 + "\n" + result3);





    /* 	divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisibleBy5 ==> true/false
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

*/

    }



}
