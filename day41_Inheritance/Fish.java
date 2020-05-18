package day41_Inheritance;

public class Fish extends Animal{
    public static void main(String[] args) {
        Fish fish1=new Fish();
        fish1.name="Nemo";
        fish1.size="small";
        fish1.weight=2;
        System.out.println(fish1.name);
        System.out.println(fish1.size);
        System.out.println(fish1.weight);
        fish1.move();
        fish1.eat();
        fish1.swim();
    }
    public void swim(){
        System.out.println(name+" is swimming");
    }

}
