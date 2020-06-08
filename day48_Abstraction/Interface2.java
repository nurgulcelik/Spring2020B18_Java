package day48_Abstraction;

public interface Interface2 {
    public static final int a=100;
    public static void method(){}
    public void method2();
    public default void method3(){}
    public static void main(String[] args) {
        System.out.println(a);
        //public void method1(){} compile error
        System.out.println(Interface2.a);
        Interface2.method();

    }
}
