package day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {
    //access-modifier specifier return type methodsName(Paramater)
    //specifier:static,final,abstract,synchronized
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list= Collections.synchronizedList(list);
        Set<Integer> set= new HashSet<>();
        set= Collections.synchronizedSet(set);
        System.out.println("====================================");
        String[] arr= {"e","b","a","d","d","c","a"};
        LinkedHashSet<String> st= new LinkedHashSet<>(Arrays.asList(arr));
        /*
        for( String each: arr){
            st.add(each);
        }
         */
        System.out.println(st);
        ArrayList<String>arraylist= new ArrayList<>(Arrays.asList("e","b","a","d","d","c","a"));
        LinkedHashSet<String>str2 = new LinkedHashSet<>(arraylist);

    }

}
