package dayInterview;

public class StringFrequency {
    /*
    Write a return method that can find the frequency of characters
    ex: "AAABBCDD"->A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = Frequency(str);
        System.out.println(result);
    }

    public static String Frequency(String str) {
        String nonDuplicated = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDuplicated.contains("" + str.charAt(i))) {
                nonDuplicated += str.charAt(i);
            }
        }
        String expectedResult = "";
        for (int j = 0; j < nonDuplicated.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDuplicated.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDuplicated.charAt(j) + "" + count;
        }
        return expectedResult;
    }
}








