package dayInterview;

public class StringUnique {
    /*
    Write a return method that can find the unique chars from the String
    Ex:"AAABBBCCCDEF"->DEF
     */
    public static void main(String[] args) {
    String str="AAABBBCCCDEF";
    String result=Unique(str);
        System.out.println(result);
    }

    public static String Unique(String str) {
        String[] arr = str.split("");
        String unique = "";
        for (String each : arr) {
            int count = 0;
            for (String each2 : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += each;
            }
        }
        return unique;
    }
}