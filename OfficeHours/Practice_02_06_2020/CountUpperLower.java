package OfficeHours.Practice_02_06_2020;

import java.util.Arrays;

public class CountUpperLower {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString((countAll("tHe hOUSE cITy bTr Cuy"))));
    }
    public static int[][] countAll(String str) {
        String[] words = str.split(" ");
        int[][] count= new int[words.length][2];
        int index=0;
        for (String word : words) {
            int upper = 0;
            int lower = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    upper++;
                } else {
                    lower++;
                }
            }
            int[] each = {upper, lower};
            count[index++] = each;

        }
        return count;
    }
}


