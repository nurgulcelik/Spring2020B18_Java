package tests;

import java.util.*;

public class Employee {
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;
    public void setEmployeeInfo(String name, long id, long ssn,String jobTitle,double salary,char gender ){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return "Name: "+name+", id: "+id+", ssn: "+ssn+
                ", job title: "+jobTitle+", salary: $"+salary;
    }
    }
   class HumanResources {
    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Ayse", 12345, 34567834, "QA", 120000, 'F');
        employee2 = new Employee();
        employee2.setEmployeeInfo("Ahmet", 34567, 98765490, "SDET", 110000, 'M');
        employee3=new Employee();
        employee3.setEmployeeInfo("Enes",12345,76845665,"SDET",130000,'M');
        employee4=new Employee();
        employee4.setEmployeeInfo("Talha",76758,29087643,"Developer",120000,'M');
        employee5=new Employee();
        employee5.setEmployeeInfo("Zeynep",34267,67509101,"PO",150000,'F');
    }
}

    class BankOfAzerbaijan{
        public static void main(String[] args) {
            ArrayList<Employee> list= new
                    ArrayList<>
                    (Arrays.asList(HumanResources.employee3,HumanResources.employee4));
           for(Employee each:list){
               System.out.println(each);
           }
        }
    }


