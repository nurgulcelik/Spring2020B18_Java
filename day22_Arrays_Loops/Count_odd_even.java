package day22_Arrays_Loops;

public class Count_odd_even {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9,10};
        int countOddNumber=0;
        int countEvenNumber=0;
        for(int each:arr){
            if(each%2!=0){//if(each%2==0){countEvenNumber++,continue;}countOddNumbers;
                countOddNumber++;
            }else{
                countEvenNumber++;
            }
        }
        System.out.println("Even number: "+countEvenNumber);
        System.out.println("Odd numbers: "+ countOddNumber);
        System.out.println("=============================");
        int count1=0;
        int count2=0;
        int[] numbers1={2,0,4,3,7,11,12,15,8,18};
        for(int each:numbers1) {
            System.out.println(each);

            if (each % 2 == 0) {
                count1++;


            }
        }
        System.out.println(count1);


            }

        }

