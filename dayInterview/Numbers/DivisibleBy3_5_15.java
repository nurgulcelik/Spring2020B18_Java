package dayInterview.Numbers;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        int[] arr= new int[100];
        String divisibleBy3="";
        String divisibleBy5="";
        String divisibleBy15="";
        for(int i=0 ;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int each:arr) {
            if (each % 3 == 0 && each % 15 == 0) {
                divisibleBy15 += each + " ";
            }
                if (each % 3 == 0 && each % 15 != 0) {
                    divisibleBy3 += each + " ";
                }
                if (each % 5 == 0 && each % 15 != 0) {
                    divisibleBy5 += each + " ";
                }
            }

                System.out.println("Divisible by 3= "+divisibleBy3);
                System.out.println("Divisible by 5= "+divisibleBy5);
                System.out.println("Divisible by 15= "+divisibleBy15);
            }
        }






