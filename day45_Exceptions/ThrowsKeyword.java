package day45_Exceptions;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class ThrowsKeyword {
    public static void sleep() throws InterruptedException {
      /*  try {
            Thread.sleep(3000);
        }catch(Exception e){}*/
        Thread.sleep(3000);
    }

    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep2();
    }

    public static void method1() throws Exception {
        String[] arr = {"A"};
        main(arr);
    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {
        }
    }
    public static void method3(){
        method2();
    }
}