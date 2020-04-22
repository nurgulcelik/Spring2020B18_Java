package day15_ForLoop;

public class reverseString {
    public static void main(String[] args) {
       /*
        String reverse1= ""+ str.charAt(3)+str.charAt(2) +str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);
        */
        String str="Java is fun";
        int lastIndexNum=str.length()-1;
        String reverse2="";
       for(int i= lastIndexNum; i>=0; i--) {
           //System.out.print(str.charAt(i));
           reverse2+=str.charAt(i);
       }
        System.out.println(reverse2);
       /* write a program to identify if a string is palindrome
       level==level if yes print true,otherwise false
        */






    }
}
