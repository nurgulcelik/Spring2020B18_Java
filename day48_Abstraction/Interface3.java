package day48_Abstraction;

public interface Interface3 {
    public static final int num=100;
    int num2=300;//by default public static final
    public void method1();
    public abstract void method2();
    public static void main(String[] args) {
    Interface3.method3();
        System.out.println(Interface3.num);
    }
    static void method3(){}
}
