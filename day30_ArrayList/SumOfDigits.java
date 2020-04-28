package day30_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/*
 write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
public class SumOfDigits {
    public static void main(String[] args) {
        String str= "a1b2c3";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        int sum=0;
        for(char each:chars){
          //  boolean isDigit= each>=48 && each <= 57;
          //  if(isDigit){
         //sum+= Integer.parseInt(""+each);



        //System.out.println(sum);
        if(Character.isDigit(each)){
            sum+=Integer.parseInt(""+each);
            }
    }
        System.out.println(sum);
        boolean a= Character.isAlphabetic('A');//IDENTIFIES IF THE CHARACTER IS ALPHABET
        System.out.println(a);
    }
}