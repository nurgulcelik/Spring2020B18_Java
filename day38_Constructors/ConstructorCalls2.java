package day38_Constructors;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("Default constructor"); }
    public ConstructorCalls2(int a){
    this();//default constructor call
        System.out.println("Constructor with argument");
    }
    public ConstructorCalls2(String str){
        //System.out.println("Hello");compile error,firstly need to write constructor
    this(10);
    //this();compile error, there need to be one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj2= new ConstructorCalls2("HELLO");
    }
    public void method(){
        //ConstructorCalls2();
    }
}
