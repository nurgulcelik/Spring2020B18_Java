package day41_Inheritance;

public class Developer extends Employee {
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public Developer(String name, String jobTitle,long id,char gender,double salary ){
        this.name=name;
        this.jobTitle=jobTitle;
        this.id=id;
        this.salary=salary;
        this.gender=gender;
    }
}
