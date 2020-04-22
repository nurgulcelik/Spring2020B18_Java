package day13_StringClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringManipulations {
    public static void main(String[] args) {
      String str= "Cybertek";// each object has index number,
     //            01234567
        char ch1= str.charAt(5);//'t'
        System.out.println(ch1=='A');//'t'=='A'
        System.out.println(ch1=='T');//'t'=='T'
       int totalLength= str.length();
        System.out.println(totalLength);
        System.out.println(totalLength>250);
        String str2= "Today is great day, Java is fun";
        int maxIndexNum= str2.length() -1;
        System.out.println(maxIndexNum);
       String s1= "Cybertek";
       s1 = s1.concat(" School");//reassigning is required to write cybertek school
        System.out.println(s1);//Cybertek School
        String s2= "Java";
        s2= s2.concat(" is a programming language");
        System.out.println(s2);
        String r1="Java is fun";
        r1= r1.concat(", and it's easy");
        System.out.println(r1);

        String name1="CYBERTEK";
        name1=name1.toLowerCase();//converts to lowercase
        System.out.println(name1);

        String name2= "cybertek school";
        name2= name2.toUpperCase();
        System.out.println(name2);

        String A1="             Today is a great day";
        A1=A1.trim();
        System.out.println(A1);






    }
}
