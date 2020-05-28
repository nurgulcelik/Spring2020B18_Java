package day44_Exceptions;

public class UncheckedException {
    public static void main(String[] args) {
        //denominator can not be zero
       // System.out.println(9/0);// unchecked,Arithmetic Exception(runtime exception)
        System.out.println("test started");
        String str="Cybertek";
       // System.out.println(str.charAt(-1));//stringoutofbounds exception
        int[] arr={1,2,3};
        //System.out.println(arr[200]);//arrayIndexOutOfBounds exception
        System.out.println("test completed");
    }
}
