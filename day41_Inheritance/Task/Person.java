package day41_Inheritance.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    public String name;
    public int age;
    public char gender;
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void setPersonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
 class Student extends Person {

   public long studentID;
    public String clazz;
    public void attendClass(){
        System.out.println(name+" is atteding the class");
    }
    public void coding(){
        System.out.println(name+" is coding in the class");
    }
    public void setStudentInfo(String name, int age, char gender,long studentID,String clazz){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;
        this.clazz=clazz;
    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Student ID: "+studentID+", Class: "+clazz;
    }
}class Employee extends Person {

    double Salary;
    long employeeID;
    String jobTitle;
    public void work(){
        System.out.println(name+" is working");
    }
    public void setEmployeeInfo(String name, int age, char gender,double Salary, long employeeID,String jobTitle){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Salary=Salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }
    public String toString(){
        return "Name: ,"+name+", Age: "+age+", Gender: "+gender+", Salary: "+Salary+", Empoyee ID: "+employeeID+", Job Title: "+jobTitle;
    }
}
 class School extends Person {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Zeynep", 16, 'F', 1234, "10-e");
        Student student2 = new Student();
        student2.setStudentInfo("Enes", 15, 'M', 1251, "7-A");
        Student student3 = new Student();
        student3.setStudentInfo("Talha", 14, 'M', 1284, "8-D");
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(student1, student2, student3));
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).name + " " + studentsList.get(i).studentID);
        }
    }
    }

