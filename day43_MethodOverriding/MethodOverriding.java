package day43_MethodOverriding;
class Test{
    public void method(){
        System.out.println("hello");
    }
}
public class MethodOverriding extends Test {
    public void method(){
        System.out.println("zeynep");
    }

    public static void main(String[] args) {
        Test obj1= new Test();
        obj1.method();//hello
        MethodOverriding obj2= new MethodOverriding();
        obj2.method();//hello
    }
}
