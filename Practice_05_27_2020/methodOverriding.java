package Practice_05_27_2020;

public class methodOverriding {
    public void method1(){
        System.out.println("super class");
    }
}
class Test extends methodOverriding{
    public void method1(){
        System.out.println("sub class");
    }

    public static void main(String[] args) {
        methodOverriding obj1= new methodOverriding();
        Test obj2= new Test();
        obj2.method1();//call the n
    }
}
