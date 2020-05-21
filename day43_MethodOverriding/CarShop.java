package day43_MethodOverriding;

public class CarShop {
    public static void main(String[] args) {
        Tesla tesla1=new Tesla();
        Honda honda1=new Honda();
        tesla1.start();
        honda1.start();
        Jeep jeep=new Jeep();
        jeep.start();
        BMW bmw=new BMW();
        bmw.start();

    }
}
