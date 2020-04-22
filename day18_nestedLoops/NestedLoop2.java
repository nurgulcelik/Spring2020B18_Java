package day18_nestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int i =1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

                }
        for (int j1 = 9; j1 >= 0; j1--) {
            for (int i1 =1; i1 <= j1; i1++) {
                System.out.print("* ");


        }System.out.println();




        }
        for (char z='a'; z<='z';z++){
            for(char ch='a'; ch<=z; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        for(int k=4; k>0; k--) {
            for (int m = 1; m <=k; m++) {
                System.out.print("$ ");
            }
            System.out.println();
}for(int f=7;f>0;f--) {
            for (int g = 1; g <= f; g++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}