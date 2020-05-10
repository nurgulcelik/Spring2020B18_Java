package dayInterview;

public class StringRemoveDuplicate {
    /*
    Write a return method that can rempove the duplicated values from String
    ex:"AAABBBCCC"->ABC
     */


    public static void main(String[] args) {
    String str="AAABBBCCC";
    String remDup=removeDuplicated(str);
        System.out.println(remDup);
    }

    public static String removeDuplicated(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}