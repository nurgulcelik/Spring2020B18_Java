package WarmUp;

public abstract class Employee {
    public String name;
    public String jobTitle;
    public int age;
    public double salary;
    public char gender;
    public abstract void work();
    public String toString() {
        return "Name: " + name + ", Gender: " + gender +", Age: "+age+
                ", job title: " + jobTitle + ", Salary: $" + salary;
    }
}
class Tester extends Employee{
    public Tester(String name, String jobTitle,int age,char gender,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.age=age;
        this.salary=salary;
        this.gender=gender;
    }
    public void work(){
        System.out.println(name+" is finding bugs");
    }
}
class Developer extends Employee{
public Developer(String name, String jobTitle,int age,char gender,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.age=age;
        this.salary=salary;
        this.gender=gender;
        }
public void work(){
        System.out.println(name+" is coding by using Java programming language");
        }
        }
        class EmployeeObjects{
            public static void main(String[] args) {
                Tester tester=new Tester("Zeynep","QA",21,'F',120000);
                System.out.println(tester);
                tester.work();
                Developer developer= new Developer("Talha","Developer",25,'M',140000);
                System.out.println(developer);
                developer.work();
            }
        }
