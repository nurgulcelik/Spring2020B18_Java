package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBCC";//A2B2C2
        System.out.println( FrequencyOfChars(str));
       String NonDup = Library.RemoveDuplicates(str);//ABC
        String result="";
        for(int i=0; i< NonDup.length();i++){
            String ch = "" + NonDup.charAt(i);//A
            int num = Library.Frequency(str, ch);
            result = result.concat(ch + num);
        }
        System.out.println(result);
    }
    public static String FrequencyOfChars(String str){//day19 you can look that
        String NonDup = Library.RemoveDuplicates(str);//ABC
        String result="";
        for(int i=0; i< NonDup.length();i++){
            String ch = "" + NonDup.charAt(i);//A
            int num = Library.Frequency(str, ch);
            result =result.concat( ch + num);
        }

        return result;
    }
}
