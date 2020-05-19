package day42_Inheritance.Task02;

public class DeviceObjects extends Device {
    public static void main(String[] args) {
        TV tv1=new TV("samsung","e23",12000,"30 inches");
        System.out.println(tv1);
        tv1.watch();
        tv1.country="USA";
        Phone phone=new Phone("iPhone","10",12000,"5 inches");
        phone.call(123456);
        phone.text(564876);
    }
}