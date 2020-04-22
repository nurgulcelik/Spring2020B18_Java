package day21_MultiDimensionalArrays;
/*
 write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class AverageNumber {
    public static void main(String[] args) {
      int[] arr ={10,20,30,40,50};
        //average: sum of all numbers/length;arr.length

   int length=arr.length;//total number of the elements
int sum=0;
for(int i=0;i<=arr.length-1; i++){
    int eachNum=arr[i];
    sum+=eachNum;
  }
        System.out.println(sum);
        System.out.println("Average number is: "+ (sum/length));
int[]arr2={1,2,3};
double average=(double)sum/length;
        System.out.println((double)5/3);
 double sum2 =0;
        double[] scoreOfQuiz={70,75,50,65,85,90,100,45,30,80,70,90,90,50,60};
        for(double each:scoreOfQuiz) {
            System.out.print(each+" ");
            sum2+=each;

        }
        System.out.println();
        System.out.println(sum2);
        System.out.println(scoreOfQuiz.length);
        System.out.println(sum2/scoreOfQuiz.length);
        }
    }

