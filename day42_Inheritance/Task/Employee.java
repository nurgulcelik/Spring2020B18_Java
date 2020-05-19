package day42_Inheritance.Task;

public class Employee extends Person {
    public double salary;
    public long employeeId;
    public String jobTitle;
    public void work(){
        System.out.println(name+" is working");
    }
    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeId, String jobTitle){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.employeeId=employeeId;
        this.jobTitle=jobTitle;
    }
    public String toString(){
        return "name: "+name+ " job title: "+jobTitle+" salary: $ "+salary;
    }
}
