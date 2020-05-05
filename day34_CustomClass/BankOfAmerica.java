package day34_CustomClass;

import java.util.*;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setTesterInfo("Enes",1234567,"QA",100000);
        Tester tester2=new Tester();
        tester2.setTesterInfo("Talha",3456789,"SDET",100000);
        Tester tester3=new Tester();
        tester3.setTesterInfo("Zeynep",5678954,"SDET",120000);
        Tester tester4=new Tester();
        tester4.setTesterInfo("Rumeysa",987654,"Manual Tester",120000);
        Tester tester5= new Tester();
        tester5.setTesterInfo("Veysel",5467326,"Uber Driver",70000);
        ArrayList<Tester>testers= new ArrayList<>(Arrays.asList(tester1,tester2,tester3));
        testers.addAll(Arrays.asList(tester4,tester5));
        testers.removeIf(p->!p.jobTitle.contains("SDET"));
        double totalBudget=0;
        for(Tester each: testers){
            System.out.println(each);
            totalBudget+=each.salary;
        }
        System.out.println(totalBudget);
    }
}
