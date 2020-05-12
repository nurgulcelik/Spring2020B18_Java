package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;
    public Dog(){//set the default value for all instances
        name="unknown";
        breed= "unknown";
        age=0;
    }
    public Dog(String breed){
        this.breed=breed;
        name="unknown";
        age=0;
    }
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
        age=0;
    }
    public Dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public String toString(){
        return "Name: "+name+", breed: "+breed+", age: "+age;
    }
}
class dogObjects{
    public static void main(String[] args) {
        Dog dog1=new Dog("Husky");
        System.out.println(dog1);
        Dog dog2=new Dog("Husky","dolly");
        System.out.println(dog2);
        Dog dog3=new Dog("Husky","dolly",2);
        System.out.println(dog3);
    }
}