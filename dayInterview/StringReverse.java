package dayInterview;

public class StringReverse {
    /*
    Write a return method that can reverse String
    ex:"ABCD"->DCBA
     */
    public static void main(String[] args) {
       String str="ZEYNEP";
        System.out.println(Reverse(str));
    }
    public static String Reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
           // reverse+=str.charAt(i);
            reverse +=str.toCharArray()[i];
        }
        return reverse;
    }
}
