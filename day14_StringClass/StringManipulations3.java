package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
   String str1= "CYBERTEK";
   String str2= "cybertek";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str2));
        String s1= "Cybertek School";
     boolean r1= s1.contains("School");
        System.out.println(r1);
/*
valid password MUST contain a special characters such as (!,~,$)
valid password should not contain spaces
 */
String Password= "mmasd 1235";
if(Password.contains("")){
    System.out.println("Password can not include a space in it");
}else{
    System.out.println("valid password");
}
String s3= "United States";
        System.out.println(s3.startsWith("U"));//true
        System.out.println(s1.endsWith("l"));




    }
}
