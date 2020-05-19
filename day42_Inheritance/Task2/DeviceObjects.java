package day42_Inheritance.Task2;

public class DeviceObjects extends Device {
    public static void main(String[] args) {
        TV obj1 = new TV();
        obj1.watch();
        Phone phone=new Phone();
        phone.call();
        phone.text();
    }
}