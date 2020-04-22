package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1= "Cat";//string pool
        String str2= new String("Cat");//java heap
        System.out.println(str1 +":"+str2);
        System.out.println(str1==str2);//two different object,false
        String str3="Cat";//string pool
        System.out.println(str1==str3);//true,same objects,they have same tasks
String str4= new String("Cat");
        System.out.println(str2==str4);//false, those two are independent objects
String s1="Java";//String pool, immutable,we cannot modify it
        s1="JavaScript";//new object will be created
        System.out.println(s1);//javascript
String s2="Java";//no new object will be created in the memory
        System.out.println(s2);
        System.out.println(s1==s2);//false

    }
}
