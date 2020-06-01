package day46_final_abstract;
class test{
    public  void method1(){// we can not use final to
        System.out.println("a");
    }

}

public class final_methods2 extends test{
    public void  method1(){
        System.out.println("b");
    }
}
