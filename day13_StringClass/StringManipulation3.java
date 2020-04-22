package day13_StringClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringManipulation3 {
    public static void main(String[] args) {
String str= "I like Java Programming John";
//           01234567, only returns very first occurred J letter
      int num1= str.indexOf("J");
      int num2=str.indexOf("John");
        System.out.println(num1);
        System.out.println(num2);

String str2= "Cybertek school is awesome";
int num3=str2.indexOf("s");
        System.out.println(num3);
        int num4= str2.indexOf("is");
        System.out.println(num4);
        int maxIndexNumber= "Cybertek".length()-1;
        System.out.println(maxIndexNumber);
        String names= "Muhtar";
       int a1= names.indexOf("Good day");
        System.out.println(a1);

        String fullName = "Rahman Abdullah";
        String firstName=fullName.substring(0,fullName.indexOf(" "));
        System.out.println(firstName);
        String lastName= fullName.substring(fullName.indexOf(" ")+1);
        System.out.println(lastName);



    }

}
