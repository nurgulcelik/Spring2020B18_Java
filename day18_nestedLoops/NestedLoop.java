package day18_nestedLoops;

public class NestedLoop {
    public static void main(String[] args) {
        for(int j=0; j<10; j++) {//10 times print inner body
            for (int i = 1; i <= 5; i++) {//1,2,3,4,5
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println("=================================");

        for( int i=0; i<7; i++) {//repeat the inner loop
            int a=1;
            while (a < 7) {
                System.out.print("*");
                a++;
            }
            System.out.println();
        }
        for(int t=0 ;t<7;t++){
            for(int s=0;s<=t;s++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
