package day38_Constructors;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }
    public Employee(String name,String jobTitle,long id){
        this(name,jobTitle);
        this.id=id;
    }
    public Employee(String name, String jobTitle,long id,double salary){
        this(name,jobTitle,id);
        this.salary=salary;
    }
    public String toString(){
        return "Name: "+name+", ID: "+id+
                ", job title: "+jobTitle+", salary: $"+salary;
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("Enes","QA",345678,120000);
        System.out.println(employee1);
    }
}
