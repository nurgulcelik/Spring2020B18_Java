package day42_Inheritance.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class School extends Person {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setStudentInfo("Zeynep",15,'F',2345,"Chemistry");
        Student student2 = new Student();
        student2.setStudentInfo("Enes",16,'M',2345,"Biology");
        Student student3 = new Student();
        student3.setStudentInfo("Talha",15,'M',3456,"Mathematics");
        ArrayList<Student> school=new
                ArrayList<>(Arrays.asList(student1,student2,student3));
        for(int i=0;i<school.size();i++){
            System.out.println(school.get(i).name+" "+school.get(i).studentId+" "+school.get(i).clazz);
        }
    }
}