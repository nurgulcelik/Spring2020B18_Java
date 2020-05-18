package day41_Inheritance;

public class Employee {
    public String name;
    public String jobTitle;
    public long id;
    public double salary;
    public char gender;

    public String toString() {
        return "Name: " + name + ", ID: " + id +
                ", job title: " + jobTitle + ", Salary: $" + salary;
    }
    public static void main(String[] args) {
        Tester tester1= new Tester("Zeynep","QA",1234,'f',120000);
       /* tester1.name="Zeynep";
        tester1.jobTitle="QA";
        tester1.salary=120000;
        tester1.id=12345;
        tester1.gender='F';*/
        System.out.println(tester1);

    }

}