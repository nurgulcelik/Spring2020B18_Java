package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice1 {
    public static void main(String[] args) {
        LinkedHashMap<String, LocalDate> classmates= new LinkedHashMap<>();

        classmates.put("Zeynep",LocalDate.of(2004,07,15) );
        classmates.put("Talha",LocalDate.of(1998,10,15) );
        classmates.put("Enes",LocalDate.of(1997,01,27) );
        classmates.put("Arslan",LocalDate.of(1970,07,15) );
        classmates.put("Veysel",LocalDate.of(1996,12,30) );
        classmates.put("Nurgul",LocalDate.of(1996,12,30) );
        System.out.println(classmates);
        System.out.println(classmates.containsKey("Muhtar"));//false
        System.out.println(classmates.containsKey("Zeynep"));//true
        System.out.println(classmates.containsValue
                (LocalDate.of(1996,12,30)));//true
        classmates.clear();
        System.out.println(classmates.isEmpty());
        System.out.println("=============================");
        LinkedHashMap<String,Integer> students=new LinkedHashMap<>();
        students.put("ZEYNEP", 90);
        students.put("ENES", 85);
        students.put("TALHA",95);
        students.put("SERAP", 70);
        students.put("VEYSEL", 95);
        System.out.println(students);
        LinkedHashMap<String,Integer> hardworking = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> nothardworking = new LinkedHashMap<>();
        for(String eachStudent: students.keySet()){
            if(students.get(eachStudent)< 90)
                System.out.println(eachStudent);
        }
    }
    }

