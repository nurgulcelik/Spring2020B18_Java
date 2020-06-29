package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {
        Map<String,Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Zeynep",120000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());
        employeeInfo.put("Talha",125000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());
        System.out.println( employeeInfo.get("Zeynep"));
        employeeInfo.remove("Zeynep");
        System.out.println(employeeInfo);
        employeeInfo.put("Zeynep",130000.0);
        System.out.println(employeeInfo);
        System.out.println("===============================");
        Map<String, LocalDate> classmates= new LinkedHashMap<>();

        classmates.put("Zeynep",LocalDate.of(2004,07,15) );
        classmates.put("Talha",LocalDate.of(1998,10,15) );
        classmates.put("Enes",LocalDate.of(1997,01,27) );
        classmates.put("Arslan",LocalDate.of(1970,07,15) );
        classmates.put("Veysel",LocalDate.of(1996,12,30) );
        System.out.println(classmates);
}
}
