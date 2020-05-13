package OfficeHours.Practice_05_13_2020;

public class Student {
    String name;
    long id;
    static String schoolName="Cybertek";
    public String toString(){
        return "Name: "+name+", id: "+id+", School Name: "+schoolName;
    }
    public void printSchoolName(){
        System.out.println(schoolName+"School Name");
    }
}
class studentObjects{
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Madina";
        student1.id=123;
        student1.schoolName="HARVARD";
        Student student2=new Student();
        student2.name= "Emrah";
        student2.id=456;
        System.out.println(student1);
        System.out.println(student2);
    }
}