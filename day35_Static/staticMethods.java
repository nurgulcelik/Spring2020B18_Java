package day35_Static;

public class staticMethods {
    int a=100;
    int c=200;
    static int b=200;
    static int d=400;
    public static void main(String[] args) {
      // System.out.println(a);compile error
        staticMethods obj= new staticMethods();
        System.out.println(obj.a);
        System.out.println(d);
        System.out.println(b);//compile , because call them
        //System.out.println(staticMethods.b);
       // System.out.println(staticMethods.d);

       //System.out.println(obj.b);//compile but prefer the through the class name
        method();
    }
    public static void method(){

        System.out.println(b);
    }
}
