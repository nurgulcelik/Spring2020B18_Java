package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        LinkedHashMap<String,String> fb = new LinkedHashMap<>();
        fb.put("Tester01","password1");
        fb.put("Tester02","password1");
        fb.put("Tester02","password2");
        fb.put("Tester03","password3");
        fb.put("Tester04","password4");
        fb.put("Tester05","password5");
        System.out.println(fb);

        for( String  eachKey : fb.keySet() ){
            System.out.println(eachKey);
        }
        for(String eachValue: fb.values()){
            System.out.println(eachValue);
        }
        List<String> usernames= new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        List<String> password= new ArrayList<>(fb.values());
        System.out.println(password);
        System.out.println("=============================");
       LinkedHashMap<String,Integer> students=new LinkedHashMap<>();
        students.put("ZEYNEP", 90);
        students.put("ENES", 85);
        students.put("TALHA",95);
        students.put("SERAP", 70);
        students.put("VEYSEL", 95);

        System.out.println(students);
        for(String eachStudent: students.keySet()){
            if(students.get(eachStudent)<90)
            System.out.println(eachStudent);
        }

    }
}
