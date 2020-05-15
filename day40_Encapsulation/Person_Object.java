package day40_Encapsulation;

public class Person_Object {
    public static void main(String[] args) {
         Person Zarina= new Person("Zarina");
        System.out.println(Zarina.name);
        Zarina.setSSN(12345);
        System.out.println("Zarina's SSN: "+Zarina.getSSN());
        Zarina.setID(98765);
        System.out.println("Zarina's ID: "+Zarina.getID());
    }
}
