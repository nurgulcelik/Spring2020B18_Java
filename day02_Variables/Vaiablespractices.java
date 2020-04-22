package day02_Variables;

public class Vaiablespractices {
    public static void main(String[] args) {
     /* salary, tax rate, loan, ssn

      */
     int salary = 120000;
     double federalTax = 0.18;
     float stateTax = 0.065F;
     // SALARY AFTER TAX= SALARY (1- SUM OF TAXES)

        double sumTaxes= federalTax +stateTax;
        double salaryAfterTax = salary + ( 1- sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("=====================");
        // area of the circle =r*r*pi
        double r= 5.5;
        double area = r*r*3.14 ;
        System.out.println(area);
        System.out.println("=====================");
        int kg= 90;
        double pound = kg * 2.25;
        System.out.println(pound);
        System.out.println("======================");

double lira = 1000;
double liraInDollar = lira /6.15;
        System.out.println(liraInDollar);
        System.out.println("========================");
        double liter = 10000;
        double gallons = liter / 3.5;
        System.out.println(gallons);





    }





}
