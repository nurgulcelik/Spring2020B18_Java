package day18_nestedLoops;

public class StringReverse {
    public static void main(String[] args) {
String str= "Java";
String rev="";
int lastIndex= str.length()-1;
do{
    rev+=str.charAt(lastIndex);

lastIndex--;
}while(lastIndex>=0);
        System.out.println(rev);

        String str1="Zeynep Nuran";
        String reverse="";
        for(int i=str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
            reverse=reverse.toUpperCase();
        }
        System.out.println(reverse);



    }


}
