package day38_Constructors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9);
        System.out.println("default");
    }
    public ConstructorCalls3(int a){
  //this(4); compile error ,constructor cannot call itself
        System.out.println("with int argument");
    }
    public ConstructorCalls3(String str){
        this(10);//this("Hello");
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
    public void method1(){
        //this(); compile error, it is not Constructor
    }
}
