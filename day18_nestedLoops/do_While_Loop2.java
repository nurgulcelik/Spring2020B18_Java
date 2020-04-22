package day18_nestedLoops;

public class do_While_Loop2 {
    public static void main(String[] args) {
        int number= 103;//103,102,101,100
        while(number>=100){
            System.out.println(number);
            number--;
        }
        System.out.println("======================================");
       int number2=103;
        do {
            System.out.println(number2);
            number2--;
        }while(number2>=100);
    }
}
