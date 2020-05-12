package day38_Constructors;

public class ConstructorPractice {
    public ConstructorPractice(){
        this(0.5);
        System.out.println("A");
    }
    public ConstructorPractice(int a){
        this();
        System.out.println("B");
    }
    public ConstructorPractice(double a){
        System.out.println("C");
    }

}
