package day23_Methods;
/* write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods

 */
public class UniqueValues {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A"};//B
        for (String each1 : arr) {
            int count1 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each1)) {
                    count1++;
                }
            }
            if (count1 == 1) {
                System.out.println(each1);
            }


            System.out.println("================================");
            for (String each2 : arr) { //4
                int count = 0;
                for (String each : arr) {
                    if (each.equals(each2)) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(each2);

                }
            }

        }


            }
        }





