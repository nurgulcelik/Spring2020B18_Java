package day14_StringClass;

import java.util.Scanner;

/*Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				one two two one
					DO NOT USE + OPERATOR
 */
public class CombineTwoString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = input.next();
        System.out.println("Enter second word: ");
        String word2= input.next();
        String result= word1.concat(" ").concat(word2).concat(" ").concat(word2).concat("").concat(word1);
        System.out.println(result);







    }
}
