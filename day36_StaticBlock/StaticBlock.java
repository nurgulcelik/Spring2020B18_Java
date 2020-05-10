package day36_StaticBlock;

public class StaticBlock {
    static{
        System.out.println("static block executed");
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        method1();
    }
    public static void method1(){
        System.out.println("Custom method executed");
    }

}
