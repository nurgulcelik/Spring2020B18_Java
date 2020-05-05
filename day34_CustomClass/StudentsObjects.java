package day34_CustomClass;

import java.util.*;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentInfo("Zeynep","Turk",15,4,'F',false);
        Student student2=new Student();
        student2.setStudentInfo("Ali","Turk",22,2.5,'M',false);
        Student student3= new Student();
        student3.setStudentInfo("Eren","Turk",23,2.5,'M',true);
        Student student4= new Student();
        student4.setStudentInfo("Rumeysa","Turk",23,4,'F',true);
        Student[] students={student1,student2,student3,student4};
        ArrayList<Student> canGraduate=new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p->p.gpa<=3.0);
        System.out.println(canGraduate.size());
        for(int i=0; i<canGraduate.size();i++){
           Student each= canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }
        System.out.println("==================================");
        ArrayList<Student> cannotGraduate= new ArrayList<>(Arrays.asList(students));
        cannotGraduate.removeIf(p->p.gpa>3.0);
        System.out.println(cannotGraduate.size());
        for(Student each:cannotGraduate) {

            System.out.println(each.name+ " can not graduate");
        }

    }
}
