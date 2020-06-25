package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collection2 {
    public static void main(String[] args) {
        LinkedHashSet<String> names= new LinkedHashSet<>();
        names.addAll(Arrays.asList("zeynep","enes","talha","veysel",
                "arslan","nurgul","zeynep","zeynep","zeynep"));
        System.out.println(names);
        Iterator<String> it  = names.iterator();
        while(it.hasNext()){
            String s= it.next();
            if(s.toLowerCase().contains("r")){//(s.contains("r")||s.contains("M)
                it.remove();
            }
        }
        System.out.println(names);
        System.out.println("=============================");
        LinkedHashSet<String> students= new LinkedHashSet<>();
        students.addAll(Arrays.asList("zeynep","enes","talha","veysel",
                "arslan","nurgul","zeynep","zeynep","zeynep"));
        for(Iterator<String>I = students.iterator(); I.hasNext();){
          String s= I.next();
          if((s.contains("r")||s.contains("M"))){
             I.remove();
            }
        }
        System.out.println(students);
        System.out.println("===================================");
        LinkedHashSet<String> students2= new LinkedHashSet<>();
        students2.addAll(Arrays.asList("zeynep","enes","talha","veysel",
                "arslan","nurgul","zeynep","zeynep","zeynep"));
        students2.removeIf(s->s.contains("r")||s.contains("M"));
        System.out.println(students2);
        System.out.println("==============================");
        LinkedHashSet<String> students3= new LinkedHashSet<>();
        students3.addAll(Arrays.asList("zeynep","enes","talha","veysel",
                "arslan","nurgul","zeynep","zeynep","zeynep"));
        students3.removeAll(Arrays.asList("arslan","nurgul","veysel"));
        System.out.println(students3);
        System.out.println("===================================");
        LinkedHashSet<String> students4= new LinkedHashSet<>();
        students4.addAll(Arrays.asList("zeynep","enes","talha","veysel",
                "arslan","nurgul","zeynep","zeynep","zeynep"));
        students4.retainAll(Arrays.asList("arslan","nurgul","veysel"));
        System.out.println(students4);
        System.out.println("=================================");
        List<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));
        //verify the 5,6,8,9 are contained in the list
        boolean result= list.containsAll(Arrays.asList(5,6,9,8,11));
        System.out.println(result);//it look like and logic//false
    }
}
