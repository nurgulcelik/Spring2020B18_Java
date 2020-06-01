package dayInterview.Numbers;

import java.sql.SQLOutput;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int a=250;
        int b=10;
        System.out.println(DivideNum(a,b));
    }
    public static int DivideNum(int num1,int num2){
        int count=0;
        if(num1>num2 && num2==0 ){

                System.out.println("Invalid number");
                System.exit(0);
            }
        while(num1>=num2){
             num1-=num2;
             count++;
        }
        return count;





    }
}
