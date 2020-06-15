package day49_Polymorphism;


interface Animal{

}

class Dog implements Animal {//can not be abstract to crate object//

 }
 class Cat implements Animal{

 }
 class Robot{}

 public class Polymorphism_Intro {
     public static void main(String[] args) {
        // Animal obj= new Animal();// compile error,we can not create because interface
         Animal obj2 =new Dog();//polymorphism
         Animal obj3= new Cat();
        // Dog    obj4= new Cat();compile error
         Dog obj5= new Dog();
         Cat obj6= new Cat();
         Robot obj7= new Robot();
         Animal [] animalShow= {obj2,obj3,obj5,obj6};
     }
 }
