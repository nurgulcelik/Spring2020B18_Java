package day41_Inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester1= new Tester("Zeynep","QA",1234,'F',12000);
        /*tester1.name="Zeynep";
        tester1.jobTitle="QA";
        tester1.salary=120000;
        tester1.id=12345;
        tester1.gender='F';*/
        System.out.println(tester1);
        Developer developer1=new Developer("Talha","Developer",3456,'M',130000);
        System.out.println(developer1);
        BusinessAnalyst BA= new BusinessAnalyst("Enes","BA",4567,'M',130000);
        System.out.println(BA);
    }
}
