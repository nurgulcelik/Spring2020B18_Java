package day42_Inheritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class A{
    int a= 100;
    public A(double a){
        System.out.println(this.a);
    }
}
public class SuperKeyword extends A {
    int a= 200;
    public SuperKeyword(){
        super(10.5);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SuperKeyword obj= new SuperKeyword();
        A obj2= new A(2);
    }

}
