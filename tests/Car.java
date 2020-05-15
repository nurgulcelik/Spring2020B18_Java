package tests;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    public Car(String brand){
      this.brand=brand;
    }
    public Car(String brand,String model){
        this(brand);
        this.model=model;
    }
    public Car(String brand, String model,int year){
        this(brand,model);
        this.year=year;
    }
    public Car(String brand, String model,int year,double price){
        this(brand,model,year);
        this.price=price;
    }
    public String toString(){
        return "year: "+year+", brand: "+brand+", model: "+model+", price: $"+price;
    }

    public static void main(String[] args) {
        Car car1= new Car("Honda","Accord",2019,25000);
        System.out.println(car1);
    }
}
