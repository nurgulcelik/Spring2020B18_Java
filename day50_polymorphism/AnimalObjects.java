package day50_polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal dog1= new Dog("lucy","female",5);
        Dog dog2= new Dog("Lucky","female",6);
        Animal cat=new Cat("larry","female",4);
        System.out.println(dog2.dogName);
        dog1.eat();
        cat.methodA();
        dog2.methodA(4);
        Animal animal1= new Cat("dj","male",3);
        boolean isDog= animal1 instanceof Cat;
        System.out.println(isDog);//true
    }
}
