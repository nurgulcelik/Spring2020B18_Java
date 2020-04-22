package day03_VariablesContinue;

public class salaryCalculator {
    public static void main(String[] args) {

double hourlyRate= 55;
double stateTaxRate= 0.04;
double federalTaxRate= 0.22;
byte weeklyHours= 40;
byte totalWeeks= 52;
double salary= hourlyRate* weeklyHours* totalWeeks;
double stateTax= salary*stateTaxRate;
double federalTax= salary*federalTaxRate;
double salaryAfterTax= salary-( stateTax+ federalTax);

System.out.println(" Your salary is:$"+ salary);
System.out.println("State Tax is:$"+ stateTax);
System.out.println("Federal Tax Is:$" + federalTax);
System.out.println("Total Tax Is:$"+ (federalTax+stateTax));
System.out.println( "Salary After Tax is:$"+salaryAfterTax);

  }
}