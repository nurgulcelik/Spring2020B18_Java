package day48_Abstraction;

interface P{
  void method1();
}
interface Q {
   int method2();
}
abstract class R{
 abstract void method3();
}

public class extends_implements2 extends R implements P,Q {
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }

    public static void main(String[] args) {
       // R obj=new R(); ABSTRACT CLASS
        //Q OBJ= new Q; NOT CLASS, NOT CONCRETE, WE CAN NOT
    }
}
