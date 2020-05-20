package OfficeHours.Practice_05_20_2020;

public class Pet {
     protected String name;
     protected int age;
     protected String color;
     protected String size;
     protected String breed;
    protected static boolean isPet;
    protected static int numberOfEyes=2;
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void sleep(){
        System.out.println(name+" is sleeping water ");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public String toString(){
        return "Name: "+name+ ", Age: "+age+", Breed: "+breed+
                ", Color: "+color;
    }
    public void setInfo(String name,int age,String color,String size,String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }
}
