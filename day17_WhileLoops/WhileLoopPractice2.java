package day17_WhileLoops;
/*
calculate the sum of the even num,between 0,10
 */

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
     while( i<=10) {//for(int i=0;i<=10,i++){}
         if(i%2==0) {
             //System.out.println(i);
             sum+=i;
         }
              i++;
         }
        System.out.println(sum);
     }


    }

