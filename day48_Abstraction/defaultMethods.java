package day48_Abstraction;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public interface defaultMethods {
    default void method() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        //  method();
    }
}
   class N implements defaultMethods{
       public static void main(String[] args) {
           N obj =new N();
           obj.method();
       }
   }




