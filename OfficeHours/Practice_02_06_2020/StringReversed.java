package OfficeHours.Practice_02_06_2020;

public class StringReversed {
    public static void main(String[] args) {
        String str ="I like java programming";
        System.out.println(Reversed(str));
    }
    public static String Reversed(String str){
        String[] words= str.split(" ");
        String reversed="";
            for(String each:words){
                String str2="";
            for(int i= each.length()-1;i>=0; i--){
                str2+= each.charAt(i);
            }
          reversed += str2+" ";
        }
            return reversed;
    }
}
