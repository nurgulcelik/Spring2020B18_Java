package OfficeHours.Practice_05_20_2020;

import day42_Inheritance.TestData2;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

class TestData{
    int num= 100;
    String name="Cybertek";
    public void method(){
        System.out.println("cybertek school");
    }
}
public class SuperKeyword2 extends TestData {
    int num=200;
    String name="mit";
    public void method(){
        System.out.println("mit school");
    }
    public SuperKeyword2(){
        super.method();
        System.out.println(this.num);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SuperKeyword2 obj=new SuperKeyword2();
    }

}
