package day21_MultiDimensionalArrays;
/*
1.write a program that can return the logest string of text from an array
	2. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String[] names={"Reem","Omer","Muhtar","Emrah","Mohammed","Ana"};
        int maxLengthString= names[0].length();
        int minLengthString=names[0].length();
        String longestWord="";
        String shortestWord="";
        for( int i=0; i<names.length; i++){
           if(names[i].length()>maxLengthString){
               maxLengthString=names[i].length();
               longestWord=names[i];
           }

           if(names[i].length()< minLengthString){
               minLengthString=names[i].length();
               shortestWord=names[i];
           }
        }

        System.out.println("The longest word in the array is: "+ longestWord);
        System.out.println("The shortest word in the array is: "+ shortestWord);

    }
}
