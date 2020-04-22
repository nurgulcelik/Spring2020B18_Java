package day19_Arrays;
/*
write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
    2. write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"
 */
public class Uniques {
    public static void main(String[] args) {
        String str = "AABCC";
        String result = "";//to store the unique character
        for (int j = 0; j <= str.length() - 1; j++) {

            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                result += str.charAt(j);
            }//if unique;

        }
        System.out.println(result);
    }
}