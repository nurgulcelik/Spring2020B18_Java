package day34_CustomClass;

public class Dog {
 String breed;
 String size;
 int age;
 String color;
 String name;
 public void eating(String food){
     System.out.println(name+" is eating "+food);
 }
 public void drinking(String drink){
     System.out.println(name+" is drinking "+drink);
 }
 public void playing(String toy){
     System.out.println(name+" is playing "+ toy);
 }
 public void setDogInfo(String breed,String size,int age,String color,String name) {
     this.breed = breed;
     this.size = size;
     this.age = age;
     this.color = color;
     this.name = name;
//this keyword is used for calling objects (instance) variables
 }
     public String toString(){
         return "Dog name is:"+name+", breed:"+breed+", size:"+size+", color:"+color+", age:"+age;
     }




    public static void main(String[] args) {

    }
}
