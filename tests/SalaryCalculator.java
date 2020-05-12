package tests;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;
    public SalaryCalculator(double hourlyRate,int weeklyHour, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }
    public double salary(){
        return hourlyRate * weeklyHour * 48;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }
    public String toString(){
        return "The hourly rate is: " +hourlyRate+" Weekly Hour: "+weeklyHour+" Salary is: $"+salary();
    }
}
class SalaryObjects{
    public static void main(String[] args) {
        SalaryCalculator salary=new SalaryCalculator(50,48,0.04,0.20);
        System.out.println(salary);
    }
}

