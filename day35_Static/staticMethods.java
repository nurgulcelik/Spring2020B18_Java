package day35_Static;

public class staticMethods {
    int a=100;
    static int b=200;
    public static void main(String[] args) {
      //  System.out.println(a);compile error
        staticMethods obj= new staticMethods();
        System.out.println(obj.a);
        System.out.println(b);//compile , because call them
        System.out.println(staticMethods.b);
       // System.out.println(obj.b);//compile but prefer the through the class name

    }
    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
