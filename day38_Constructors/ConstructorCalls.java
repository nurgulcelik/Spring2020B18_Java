package day38_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        method1();
        method2();
    }
    public ConstructorCalls(int a){
        //ConstructorCalls();
        this();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
        method1();
       // ConstructorCalls();compile error
    }
}
