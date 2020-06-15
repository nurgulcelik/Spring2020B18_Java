package day49_Polymorphism;

public class phoneObjects {
    public static void main(String[] args) {
        iPhone phone1= new iPhone("X",1000,"10 inches");
        System.out.println(phone1);
        phone1.calling(123456);
        phone1.texting(456789);
        phone1.faceTiming(678965);
    }
}
