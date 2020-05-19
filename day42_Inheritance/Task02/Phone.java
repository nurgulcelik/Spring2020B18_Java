package day42_Inheritance.Task02;

public class Phone extends Device {
    public void call(long number){
        System.out.println("Calling the number "+number);
    }
    public void text(long number){
        System.out.println("I am texting to "+number);
    }
    public Phone(String brand,String model,double price, String size){
        setDevice(brand,model,price,"Phone","Large");
    }
}

