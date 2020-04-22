package day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10);
        method(10.0);
    }

    public static void method(int a){
        System.out.println("Original Method");
    }
    public static void method(double a){// or (int a,int b)
        System.out.println("Overloaded Method");
    }
}
