package day09_NestedIf_Ternary;

public class IfStatements_WithoutCurlyBraces {
    public static void main(String[] args) {
  int number=100;
  if(number%2==0)
      System.out.println("Even Number");
  else
      System.out.println("Odd Number");

  if(true)//if the block containing more than one statement we must give the body
      System.out.println("Hello");
        System.out.println("Condition is true");
        System.out.println("Test executed");
//this is not good habit (without curly braces if),not use it

    }


}
