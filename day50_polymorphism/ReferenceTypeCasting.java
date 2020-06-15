package day50_polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a=100;
        double b=a;//implicit casting
        Dog dog= new Dog("aoron","male",3);
        Animal animal1=dog;//upcasting done implicitly
        //Animal animal1= (Animal)dog;
        Cat cat= new Cat("minnos","female",3);
        Animal animal2=cat;
        System.out.println("=======================================");
        double c=10;
        int d=(int)c;//explicit casting done by manually
        Animal animal3= new Dog("lucky","male",5);
        //Dog dog3= animal3;it give compile error
        //Dog animal3=new Dog() , you can use Dog dog3=animal3, it compile
        Dog dog3=(Dog) animal3;
        Animal animal4= new Cat("shirin","female",5);
        Cat cat2= (Cat)animal4;
        Animal animal5= new Dog("lucy","female",3);
        Dog dog2=(Dog)animal5;
        dog2.bark();
        ((Dog)animal5).bark();
        Dog dog4= (Dog) animal5;
    }
}
