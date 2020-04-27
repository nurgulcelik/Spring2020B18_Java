package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {
        //ArrayList<data type> name = new ArrayList<data type>();
        ArrayList<Integer>scores= new ArrayList<Integer>();//0,
        // add five elements size 5,2 elements remove then size 3,
        // it is dynamic, it keep changing
       //ArrayList<Character>charList = new ArrayList<Character>();
        //int[] arr= new int[3];
        //ArrayList<String>NameList= new ArrayList<String>();
        scores.add(10);//autoboxing
        scores.add(20);
        scores.add(30);//size is 3 scores[2]=30
        System.out.println(scores);
       Integer a= scores.get(2);//wrapper to wrapper
       int b= scores.get(2);
       double d=scores.get(2);//wrapper to primitive,unboxing
        System.out.println(d);//30.0
        System.out.println(100);//indexoutofboundexception
        /* 1.create a list of integer
        2.add five integer
        3.return the max num from array list  */

    }
}
