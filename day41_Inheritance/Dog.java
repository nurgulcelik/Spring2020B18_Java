package day41_Inheritance;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Lucy";
        System.out.println(dog1.name);
        dog1.size="small";
        System.out.println(dog1.size);
        dog1.move();//Lucy is moving
        dog1.eat();//Lucy is eating
      //  dog1.swim();
        dog1.bark();
    }
    public void bark(){
        System.out.println(name+" is barking");
    }
}
