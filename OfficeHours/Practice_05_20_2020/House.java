package OfficeHours.Practice_05_20_2020;

public class House extends Pet {
    public static void main(String[] args) {
        Dog dog1=new Dog("Latte",3,"brown","medium","Cocker Spaniel");
       // dog1.setInfo("Karabas",5,"black","large","Husky");
        System.out.println(dog1);
        Cat cat1=new Cat("Bonbon", 2, "Brown", "Small", "Abyssinian");
        System.out.println(cat1);//House has a cat,there is "has a relation"
    }
}
