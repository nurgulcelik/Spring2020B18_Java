package day48_Abstraction;

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;
    public String toString(){
        return "Brand: "+brand+" Model: "+model+" Size: "+size+ " Price: $"+price;
    }
    public abstract void calling(long phoneNumber);
    public abstract void texting(long phoneNumber);
}

