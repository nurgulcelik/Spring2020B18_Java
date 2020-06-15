package Warmup2;



public class Animal {
    char gender;
    int age;
    public void eat(String food){
        System.out.println("Animal is eating " +food);
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Cat extends Animal{
    String catName;

    @Override
    public void eat(String catFood) {
        System.out.println(catName+" is eating "+ catFood);
    }

    @Override
    public void sleep() {
        System.out.println(catName+" is sleeping");
    }

    public void scratch(){
        System.out.println(catName+ " is scratching");
    }
}
class Dog extends Animal{
    String dogName;
    public void bark(){
        System.out.println(dogName+" is barking");
    }

    @Override
    public void eat(String dogFood) {
        System.out.println(dogName+" is eating "+dogFood);
    }

    @Override
    public void sleep() {
        System.out.println(dogName+ " is sleeping");
    }
}
