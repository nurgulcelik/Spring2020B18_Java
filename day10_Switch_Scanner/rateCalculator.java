package day10_Switch_Scanner;
import java.util.Scanner;
/*write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate

 */
public class rateCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary= scan.nextInt();
        System.out.println("How many hours do you work per week: ");
        int weeklyHours = scan.nextInt();
        System.out.println("How many weeks do you work in a week: ");
byte numberOfWeeks= scan.nextByte();
//hourlyRate= (salary/ numberOfWeeks)/weeklyHours
        int hourlyRate=(salary/ numberOfWeeks)/weeklyHours;
        System.out.println("Your hourly rate is: $"+ hourlyRate);
    }
}
