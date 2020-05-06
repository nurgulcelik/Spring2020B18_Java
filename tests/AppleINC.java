package tests;
import java.util.*;
public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Ayse","QA",120000,12345);
        Tester tester2=new Tester();
        tester2.setInfo("Emine","SDET",150000,56789);
        Tester tester3=new Tester();
        tester3.setInfo("Fatma","QA",150000, 12345);
        ScrumTeam scrum1= new ScrumTeam();
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester3);
        ScrumTeam scrum2= new ScrumTeam();
        scrum2.hireATester(tester2);
        ScrumTeam scrum3= new ScrumTeam();
        scrum3.hireATester(tester3);
        for(Tester each: scrum1.testersTeam){
            System.out.println(each);
        }
        Developer developer1= new Developer();
        developer1.setInfo("Talha","Junior Developer",120000,67890);
        Developer developer2=new Developer();
        developer2.setInfo("Veysel","Senior Developer",150000, 12345);
        scrum1.hireADeveloper(developer1);
        scrum1.hireADeveloper(developer2);
        System.out.println(scrum1.devpTeam.size());
        for(Developer each:scrum1.devpTeam){
            System.out.println(each);
            System.out.println("In my Scrum Team, we have "+scrum1.testersTeam.size()+
                   " testers "+ scrum1.devpTeam.size()+" developers");
        }
    }
}
