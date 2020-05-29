package day45_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws Exception{//the caller is responsible
        // for handling the exception
        System.out.println("Java");
        Thread.sleep(3000);
        System.out.println("Cybertek");
        Thread.sleep(3000);
        System.out.println("Batch 18");
        Thread.sleep(4000);
        System.out.println("Completed");
    }
}
