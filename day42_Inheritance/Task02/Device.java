package day42_Inheritance.Task02;

public class Device {
   public String brand;
   public String model;
   public double price;
   public static String country="China";
   public String type;
   public String size;
   public String toString(){

      return "Brand: "+brand+" Model: "+model+" Size: "+size+" type: "+type+ " Price: $"+price+", Made in "+country;
   }
   public void setDevice(String brand,String model,double price,String type,String size){
      this.brand=brand;
      this.model=model;
      this.price=price;
      this.size=size;
      this.type=type;

   }
}
