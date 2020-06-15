package day50_polymorphism;


public  class Abstraction extends A implements I{
  //  public abstract void method();
    public void method4(){}

    @Override
    public void method3() {

    }

    @Override
    public void method() {

    }

    @Override
    void method1() {

    }

    @Override
    protected void method2() {

    }
}
abstract class A{
    abstract void method1() ;
    protected abstract void method2();
    {
        //instance block
    }
    static{
        //static block
    }
    //you can have any kind of variable

}
interface I{
    void method3();
    abstract void method();
   // public I(){}
   // public void instanceMethod(){}
    //{}
    //static{}
    int a=100;//static,final,public

    public static void main(String[] args) {
        System.out.println(a);//static var
      //  a=200; you can not reassign final variable
    }
}
