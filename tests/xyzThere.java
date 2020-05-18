package tests;

import java.util.Arrays;

public class xyzThere {
    public static boolean xyzTh(String str) {
        if (str.startsWith("xyz")) return true;
        for (int i = 0; i < str.length() - 3; i++) {
            String word = str.substring(i, i + 4);
            if (!word.startsWith(".") && word.substring(1).equals("xyz"))
                return true;
        }
        return false;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String word = str.substring(i, i + 3);
            if (word.equals("cat")) cat++;
            if (word.equals("dog")) dog++;
        }
        return cat == dog;
    }

    public static boolean isAnagram(String one, String two) {
        if (one.length() != two.length()) return false;
        int[] count = new int[26];//a=0,z=25
        for (int i = 0; i < one.length(); ) {
            one.charAt(i);
            //count[0]=count[0]+1;
            char c = one.charAt(i);
            char d = two.charAt(i);
            count[c - 97] = count[c - 97] + 1;
            count[d - 97] = count[d - 97] - 1;
        }
        return Arrays.equals(count,new int[26]);

        }



    public static void main(String[] args) {
        String str="abc.xyz";
        System.out.println(xyzTh(str));
        String str2="abcxyz";
        System.out.println(xyzTh(str2));
        String str3="catdogcat";
        System.out.println( catDog(str3));
//for(int i=0;i<str.length()-3;i++){
// if(str.substring (i,i+2).equals("co")+"d"+str.substring(i+3,i+4).equals("e"))
// return true;}
    }
}
