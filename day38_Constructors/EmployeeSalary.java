package day38_Constructors;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator employee1=new SalaryCalculator(50,48,0.085,0.2);
        System.out.println(employee1);
        System.out.println(employee1.salary());
        SalaryCalculator employee2=new SalaryCalculator(62,40,8.75/100,0.26);
        System.out.println(employee2);
    }
}
