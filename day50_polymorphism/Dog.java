package day50_polymorphism;

public class Dog extends Animal {
    public String dogName;
    public void bark(){
        System.out.println(dogName+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(dogName+" is eating ");
    }

    @Override
    public void sleep() {
        System.out.println(dogName+ " is sleeping");
    }
    public Dog(String dogName,String gender,int age){
        this.dogName=dogName;
        this.gender=gender;
        this.age=age;
    }
    public static void methodA(int a){
        System.out.println("dog class");
    }
}
