package day39_AccessModifiers;
/*
create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
  static String companyName="BOA";
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
                ", job title: "+jobTitle+ ", Company name: "+companyName+", salary: $"+salary;
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("Enes","QA",345678,120000);
        System.out.println(employee1);
        Employee employee2= new Employee("Talha","SDET",1234,130000);
        System.out.println(employee2);
    }
}
