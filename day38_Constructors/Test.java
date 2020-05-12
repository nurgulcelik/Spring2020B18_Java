package day38_Constructors;

public class Test {
    public Test(){
        System.out.println("Constructor");
    }

    {
        System.out.println("instance block");
        //if you don't have object cannot execute
    }

    public static void main(String[] args) {
        new Test();//instance then constructor
        new Test();//instance then constructor
    }
    static{
        System.out.println("static block");
    }
}
