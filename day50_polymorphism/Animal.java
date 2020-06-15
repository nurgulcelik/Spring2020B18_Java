package day50_polymorphism;

public abstract class Animal {
   public String gender;
   public int age;
    public void eat(){
        System.out.println("Animal is eating " );
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
        System.out.println("animal class");
    }
}

