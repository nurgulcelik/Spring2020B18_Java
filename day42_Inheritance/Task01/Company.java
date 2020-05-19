package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class Company extends Person {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeInfo("Enes",22,'M',120000,2345,"QA");
        Employee employee2 = new Employee();
        employee2.setEmployeeInfo("Zeynep",23,'F',130000,4567,"Developer");
        Employee employee3 = new Employee();
        employee3.setEmployeeInfo("Talha",24,'F',130000,5678,"Tester");
        ArrayList<Employee>company=new
                ArrayList(Arrays.asList(employee1,employee2,employee3));
        for(Employee each:company){
            System.out.println(each.name+" "+each.employeeId);
        }
    }
}