package day50_polymorphism;

public final class Cat extends Animal {//3 variables,
    public String catName;
    public Cat(String catName,String gender,int age){
        this.catName=catName;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println(catName+" is eating ");
    }

    @Override
    public void sleep() {
        System.out.println(catName+" is sleeping");
    }

    public void scratch(){
        System.out.println(catName+ " is scratching");
    }
}
