package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo Zeynep= new EmployeeInfo();
        Zeynep.setAddress("Virginia");
        Zeynep.setSalary(120000.0);
        System.out.println(Zeynep.getAddress());
        System.out.println(Zeynep.getSalary());
        System.out.println(Zeynep.companyName);
    }
}
