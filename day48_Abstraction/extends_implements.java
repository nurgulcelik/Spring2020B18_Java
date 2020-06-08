package day48_Abstraction;

interface I1{//1 abstract
   void method1();
}
interface I2 extends I1{//2 abstract
    void method2();
}
abstract class AC implements I2{//3 abstract
    abstract void method3();
}


public abstract class extends_implements extends AC{//3 abstract class
    @Override
    public void method2() { }//2 abstract left, method1 and method3 left

}
 class testRun extends extends_implements {
     @Override
     public void method1() {

     }

     @Override
     public void method3() {

     }
 }
