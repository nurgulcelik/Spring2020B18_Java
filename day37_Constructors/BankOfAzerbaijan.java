package day37_Constructors;



import java.util.ArrayList;
import java.util.Arrays;
import day37_Constructors.HumanResources;
public class BankOfAzerbaijan {
    /*
    create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
     */
    public static void main(String[] args) {
        ArrayList<Employee> list= new
                ArrayList<>();

        for(Employee each:list){
            System.out.println(each);
        }
    }
}
