package day37_Constructors;

import tests.Employee;

public class HumanResources {
    /*
     create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

     */
        static tests.Employee employee1= employee1 = new tests.Employee();
        static tests.Employee employee2=employee2 = new tests.Employee();
        static tests.Employee employee3=employee3=new tests.Employee();
        static tests.Employee employee4=employee4=new tests.Employee();
        static tests.Employee employee5= employee5=new Employee();

        static {

            employee1.setEmployeeInfo("Ayse", 12345, 34567834, "QA", 120000, 'F');

            employee2.setEmployeeInfo("Ahmet", 34567, 98765490, "SDET", 110000, 'M');

            employee3.setEmployeeInfo("Enes",12345,76845665,"SDET",130000,'M');

            employee4.setEmployeeInfo("Talha",76758,29087643,"Developer",120000,'M');

            employee5.setEmployeeInfo("Zeynep",34267,67509101,"PO",150000,'F');
        }

    public static void main(String[] args) {

    }
    }


