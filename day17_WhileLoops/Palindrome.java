package day17_WhileLoops;
// write a program that can check the palindrome by using while loop
public class Palindrome {
    public static void main(String[] args) {

       String str="Java" ;
       String reversedStr="";
       int index= str.length()-1;
       while(index>=0){
           reversedStr+=str.charAt((index));
           index--;
       }
        System.out.println(reversedStr);
       boolean palindrome=reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);



    }


}
