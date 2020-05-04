package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Uniques {
    /*
     write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList

     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
       // Predicate<Integer> frequency= x-> Collections.frequency(numbers,x)>1;
        //numbers.removeIf(frequency);
        numbers.removeIf(p-> Collections.frequency(numbers,p)>1);//[2,3,4],uniques
        //numbers.removeIf(p-> Collections.frequency(numbers,p)==1);[1,1,5,5],non unique
        System.out.println(numbers);

    }
}
