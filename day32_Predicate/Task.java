package day32_Predicate;
import java.util.*;
import java.util.function.Predicate;

public class Task {
    public static void main(String[] args) {//TASK 1
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer>frequency= x->Collections.frequency(numbers,x)>1;
        numbers.removeIf(frequency);
        System.out.println(numbers);//[2,3,4]
        System.out.println("===============================");//TASK 2
        ArrayList<Integer> numbers2= new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> nonDup= x->Collections.frequency(numbers2,x)==1;
        numbers2.removeIf(nonDup);
        System.out.println(numbers2);//[1,1,5,5]
        System.out.println("=================================");//TASK 3

        ArrayList<String>countryNames=new ArrayList<>();
        countryNames.addAll(Arrays.asList("Turkey","Netherlands","Sweeden","Iraq","Saudi Arabia"));
        Predicate<String>longNameOfCountry= x->x.length()>=10;
        countryNames.removeIf(longNameOfCountry);
        System.out.println(countryNames);//[Turkey,Sweeden,Iraq]
        System.out.println("==============================");//TASK 4
        String str="ABCD123$%^&*~456EFG";
        ArrayList<Character>list= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        ArrayList<Character>Digit=new ArrayList<>();
        ArrayList<Character>Alphabetic=new ArrayList<>();
        ArrayList<Character>Signs= new ArrayList<>();
        for(int i=0;i<list.size();i++){
           if(Character.isDigit(list.get(i))){
               Digit.add(list.get(i));
           }
            if(Character.isAlphabetic(list.get(i))){
                Alphabetic.add(list.get(i));
            }
            boolean signsNum=Character.isDigit(list.get(i));
            boolean signsAlphabet=Character.isAlphabetic(list.get(i));
            if( !signsNum & !signsAlphabet){
                Signs.add(list.get(i));

            }
        }
        System.out.println(Digit);
        System.out.println(Alphabetic);
        System.out.println(Signs);
    }

}
