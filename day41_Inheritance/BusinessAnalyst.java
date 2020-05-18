package day41_Inheritance;

public class BusinessAnalyst extends Employee {
    public void writingRequirements(){
        System.out.println(name+" is writing requirements");
    }
    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }
    public BusinessAnalyst(String name, String jobTitle,long id,char gender,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.id=id;
        this.salary=salary;
        this.gender=gender;
    }
    }

