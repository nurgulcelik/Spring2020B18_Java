package tests;

public class TASK {
    public static void main(String[] args) {
        String[] words = {"java","java", "ayse","ayse","sema","ay"};

        for (String each2 : words) {
            int count = 0;

            for (String each : words) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }
}