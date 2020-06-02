package WarmUp;

public abstract class Pets {
    public String name;
    public int age;
     public String color;
    public String breed;
    public char gender;
    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();
    public String toString(){
        return "Name: "+name+", Breed: "+breed+", Age: "+age+
                ", Color: "+color+", Gender: "+gender;
    }
}
class Dog extends Pets{
    public Dog( String name, String breed, int age, String color, char gender){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public void sleep(){
        System.out.println(name+" can sleep 7 hours");
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating dogfood");
    }
    @Override
    public void speak(){
        System.out.println(name+" can speak doglanguage");
    }
}
class Cat extends Pets{
    public Cat( String name, String breed, int age, String color, char gender){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public void sleep(){
        System.out.println(name+" can sleep 8 hours");
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating catfood");
    }
    @Override
    public void speak(){
        System.out.println(name+" can speak catlanguage");
    }
}
class Tiger extends Pets{
    public Tiger( String name, String breed, int age, String color, char gender){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public void sleep(){
        System.out.println(name+" can sleep 6 hours");
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating meat");
    }
    @Override
    public void speak(){
        System.out.println(name+" can speak tigerlanguage");
    }
}
class PetsObjects{
    public static void main(String[] args) {
        Dog dog=new Dog("Dolly","Husky",4,"Brown",'F');
        dog.eat();dog.sleep();dog.speak();
        System.out.println(dog);
        Cat cat=new Cat("Ghost","Siemes",3,"White",'M');
        cat.eat();cat.sleep();cat.speak();
        System.out.println(cat);
    }
}

