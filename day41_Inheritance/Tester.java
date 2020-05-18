package day41_Inheritance;

public class Tester extends Employee{
    public void reportingBug(){
        System.out.println(name+" is reporting a bug");
    }
    public void testing(){
        System.out.println(name+" is testing");
    }
    public Tester(String name, String jobTitle,long id,char gender,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.id=id;
        this.salary=salary;
        this.gender=gender;
}
}
