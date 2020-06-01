package dayInterview.Numbers;

public class odd_Even {
    public static void main(String[] args) {
        int a=3;
        System.out.println(Odd_Even(a));
    }
    public static String Odd_Even(int num){
        String result;
        if(num % 2 ==0){
            result= num+" is even number";
        }else{
            result= num+" is odd number";

        }
        return result;
    }
}
