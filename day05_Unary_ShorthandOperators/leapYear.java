package day05_Unary_ShorthandOperators;

public class leapYear {
    public static void main(String[] args) {
   short year= 2020;
   // leapYear: year%4==0
        // if returns true; leapYear
        boolean leapYear= year % 4==0;
        //if the year can be divided by 4 without any reminder, then it's leap year
        System.out.println( year + " is leap year:" + leapYear);
String result= year + " is leap year: " + leapYear;
        System.out.println(result);




    }




}
