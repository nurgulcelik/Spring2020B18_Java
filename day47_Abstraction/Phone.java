package day47_Abstraction;

public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;
    public String toString(){
        return "Brand: "+brand+" Model: "+model+" Size: "+size+ " Price: $"+price;
    }
    public abstract void calling();
    public abstract void texting();
}
class iPhone extends Phone{
    public iPhone(String brand, String model, double price,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;
    }
    @Override
    public  void calling(){
        System.out.println("I am calling by using" +brand );
    }
    @Override
    public  void texting(){
        System.out.println("I am texting by using" +brand);
    }
}

class Samsung extends Phone{
    public Samsung(String brand, String model, double price,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;
    }
    @Override
    public  void calling(){
        System.out.println("I am calling by using" +brand);
    }
    @Override
    public  void texting(){
        System.out.println("I am texting by using" +brand);
    }
}


