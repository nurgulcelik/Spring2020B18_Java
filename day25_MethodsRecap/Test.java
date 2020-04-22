package day25_MethodsRecap;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="ABCABC";
        String result=Library.RemoveDuplicates(str);
        System.out.println(result);
        String str1="AABBCDE";
        String str2="B";
        int count= Library.Frequency(str1,str2);
        System.out.println(count);
        String str3= "MMMMNNNKKYYZZZZ";
       String frequency =Library.FrequencyOfChars(str3);
        System.out.println(frequency);
    }
}
