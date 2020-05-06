package tests;

public class Tester {
 String name;
 String jobTitle;
 double salary;
 long employeeId;

 public void setInfo(String name,String jobTitle,double salary,long employeeId){
     this.name=name;
     this.jobTitle=jobTitle;
     this.salary=salary;
     this.employeeId=employeeId;
 }
 public String toString(){
     return"Name: "+name+", job title: "+jobTitle+", salary: $"+salary+", ID: "+employeeId;
 }
   public void smokeTesting(){
       System.out.println(name+" is doing smoke test");
   }
   public void creatingTicket(){
       System.out.println(this.name+" is creating ticket on Jira");
   }



}
