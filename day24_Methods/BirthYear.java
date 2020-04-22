package day24_Methods;

public class BirthYear {

    public static void Age(short birthYear) {
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if (age>0 &&  birthYear>1900) {
            System.out.println(age);
        } else {
            System.out.println("Invalid birth year");
        }
    }
    public static void main(String[] args) {
        short a=1975;
        Age(a);
    }

}
