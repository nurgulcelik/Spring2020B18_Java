package day25_MethodsRecap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "ABAB";//AFTER REMOVING DUPLICATE AB
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(ch + "")) {
                result = result.concat(ch+"");
            }
        }
        System.out.println(result);
        String str2="ABCABC";
        String result2= RemoveDuplicates(str2);
        System.out.println(result2);

        String str3="AAABBCDD";
        String result3=NonDuplicate(str3);
        System.out.println(result3);
    }

    public static String RemoveDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(ch + "")) {
                result = result.concat(ch+"");
            }
        }
        return result;
    }
    public static String NonDuplicate(String str){
        String result="";

          for(int i=0;i<str.length(); i++){
        if(!(result.contains(str.charAt(i)+""))){
            result =result.concat(""+str.charAt(i));

        }
        }
        return result;
    }
}