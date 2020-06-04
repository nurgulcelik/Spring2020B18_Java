package day47_Abstraction;
abstract class
A{
    public abstract void method1();
public void method2(){}
}
public class Abstract_NonAbstract2 extends A {//mandatory to override
    @Override
    public void method1() {

    }
}
abstract class B extends A{//not mandatory to override, it is optional

}
class C extends B{
    @Override
    public void method1() {

    }
}