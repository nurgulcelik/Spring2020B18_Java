package day42_Inheritance.Task02;

public class TV extends Device{
    public void watch() {
        System.out.println("I am watching "+brand+" of the TV");
    }
    public TV(String brand, String model, double price, String size){
       setDevice(brand,model,price,"TV",size);
    }
}
