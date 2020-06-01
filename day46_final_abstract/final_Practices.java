package day46_final_abstract;

public class final_Practices {
    final int a=10;
    final static int b=20;
    {
        System.out.println(a);
        //a=20; final can not reassigned
    }
    static{
        System.out.println(b);
      //  b=30; final cannot reassigned
    }
    public final_Practices(){

    }
    final void method1(){}
    public final static void method2(){}
    private void method1(int a){}
    public final static void method1(int a,int b){}
}
class test1 extends final_Practices{
   // @Override
    //protected void method1(){}
}
