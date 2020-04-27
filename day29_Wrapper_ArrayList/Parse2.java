package day29_Wrapper_ArrayList;

public class Parse2 {
    public static void main(String[] args) {
        String str3="899999";
        long num1=Long.parseLong(str3);
        System.out.println(num1+1);
        Long num2 = Long.parseLong(str3);
        System.out.println(num2+1);
        String result= "true";
        boolean r1= Boolean.parseBoolean(result);
        System.out.println(!r1);
        String result2= "Today is Monday";
        boolean r3= Boolean.parseBoolean(result2);
        System.out.println(r3);
        // false, because the string is not matching "true" or "false",
        // default value will appear,that is false
        // when apply parse method case sensitivity does not matter,
        // parse is not case sensitive
        String result4="fAlSe";
        boolean bl1=Boolean.parseBoolean(result4);
        System.out.println(bl1);
    }
}
