package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {

//write a java program that accepts three numbers and return the minimum number
//				(assume that none of them are equal)

        double a= 100;
        double b= 200;
        double c= 300;
      boolean aGreater = a>b && a>c;//if a is greater than both b and c; then a is maximum
      boolean bGreater = b>a && b>c;// if b is greater than both a,c, then b is maximum
      boolean cGreater = c>a && c>b;// if c is greater than both a,b,then c is maximum
if ( aGreater) {
    System.out.println(a + " is greater number");
}else if ( bGreater){
    System.out.println( b+ " is greater number");
}else{
    System.out.println( c + " is greater number");
    double result3= (a>b && a>c)?a:(b>a && b>c)?b:c;
    System.out.println(result3);
}
int num1=400;
int num2=200;
int num3= 300;
boolean num1Greater = num1>num2 && num1>num3;
boolean num2Greater= num2>num1 && num2> num3;
boolean num3Greater= num3>num1 && num3>num2;
int result1= (num1>num2 && num1>num3)?num1:(num2>num1 && num2> num3)?num2:num3;
int result2= (num1Greater)?num1:(num2Greater)?num2:num3;
        System.out.println(result1);
        System.out.println(result2);
    }
}
