package day49_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee {
    public double salary;
    public int ID;
    public String name;
    public String jobTitle;
    abstract void work();
}
class Tester extends Employee{
    @Override
    void work() {
        System.out.println("Tester is finding bugs");
    }
}
class Developer extends Employee{
    @Override
    void work() {
        System.out.println("Developer is coding");
    }
}
class ScrumTeam {
    public static void main(String[] args) {



        ArrayList<Employee> list = new ArrayList<>();

        Employee tester1 = new Tester();
        Employee tester2 = new Tester();
        Employee tester3 = new Tester();
        Employee developer1 = new Developer();
        Employee developer2= new Developer();
        Employee developer3 = new Developer();
        Employee developer4 = new Developer();

        Employee [] ScrumTeam = {tester1,tester2,tester3,developer1,developer2,developer3,developer4};
        list.addAll(Arrays.asList(ScrumTeam));

    }

    }


