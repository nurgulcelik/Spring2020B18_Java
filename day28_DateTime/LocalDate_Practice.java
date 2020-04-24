package day28_DateTime;

import java.time.LocalDate;

/*
1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */
public class LocalDate_Practice {
    public static void main(String[] args) {
       String[] friends ={"john","aoron","daniel"};

        LocalDate JohnBirthday= LocalDate.of(2020,3,5);
        LocalDate AoronBirthday= LocalDate.of(2000,4,5);
        LocalDate DanielBirthday= LocalDate.of(2010,5,5);
        LocalDate[] birthdays={JohnBirthday,AoronBirthday,DanielBirthday};
        /*int a=100;
        int b=200;
        int c=300;
        int[] array1=*/
        for(int i=0;i<friends.length;i++){
            String names=friends[i];
           LocalDate bd =birthdays[i];
            System.out.println(names+"'s birthday is "+ bd);
        }

    }
}
