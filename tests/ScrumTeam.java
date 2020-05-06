package tests;
import java.util.*;
public class ScrumTeam {
    ArrayList<Tester>testersTeam= new ArrayList<>();
    ArrayList<Developer>devpTeam= new ArrayList<>();
    public void hireATester(Tester tester){
     testersTeam.add(tester);
    }
    public void fireATester(long id){
    testersTeam.removeIf(p->p.employeeId==id);
    }
    public void hireADeveloper(Developer developer){
     devpTeam.add(developer);
    }
    public void fireADeveloper(long id){
        devpTeam.removeIf(p->p.employeeId==id);

    }
}
