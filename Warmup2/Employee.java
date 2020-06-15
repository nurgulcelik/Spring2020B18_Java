package Warmup2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee {
    private String employeeName;
    private long employeeId;
    private double salary;
    private long SSN;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;
    public String getEmployeeName(){
      return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN){
        this.SSN=SSN;
    }
    public long getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(long employeeId){
        this.employeeId=employeeId;
    }

    public boolean isFullTime() {
        return isFullTime;
    }
    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }
    public abstract void work();
    public abstract void meeting();
    public Employee(String employeeName, long employeeId, double salary, long SSN,
                    String jobTitle,boolean isFullTime,boolean hasPTO){
        this.employeeName=employeeName;
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setSalary(salary);
        setHasPTO(hasPTO);
        setSSN(SSN);
    }

    @Override
    public String toString() {
        return "employeeName=" + employeeName +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", SSN=" + SSN +
                ", jobTitle=" + jobTitle +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO ;
    }
}
interface ScrumTeam{
    boolean has_ScrumMaster=true;
    void dailyStandup();
    }
interface WorkRemotely{
    void workFromHome();
    }
    final class Tester extends Employee implements ScrumTeam,WorkRemotely{
        @Override
        public void work() {
            System.out.println(getEmployeeName()+ " is working as a tester");
        }

        @Override
        public void meeting() {
            System.out.println(getEmployeeName()+" is meeting with scrumteam");
        }

        @Override
        public void dailyStandup() {
            System.out.println(getEmployeeName()+ " is attending the daily standup meeting");
        }

        @Override
        public void workFromHome() {
            System.out.println(getEmployeeName()+" is working from home");
        }
        public void findingBug(){
            System.out.println(getEmployeeName()+" is finding a bug");
        }
        public void creatingBugTicket(){
            System.out.println(getEmployeeName()+ "is creating a bug ticket");
        }
        public Tester(String employeeName, long employeeId, double salary, long SSN,
                      String jobTitle,boolean isFullTime,boolean hasPTO){
            super(employeeName,employeeId,salary,SSN,jobTitle,isFullTime,hasPTO);
        }
    }
    final class Developer extends Employee implements ScrumTeam,WorkRemotely{
        @Override
        public void work() {
            System.out.println(getEmployeeName()+" is working as a Developer");
        }

        @Override
        public void meeting() {
            System.out.println(getEmployeeName()+" is meeting with scrumteam");
        }

        @Override
        public void dailyStandup() {
            System.out.println(getEmployeeName()+ " is attending daily standup meeting");
        }

        @Override
        public void workFromHome() {
            System.out.println(getEmployeeName()+ " is working from home");
        }

        public Developer(String employeeName, long employeeId, double salary, long SSN,
                         String jobTitle,boolean isFullTime,boolean hasPTO) {
            super(employeeName,employeeId,salary,SSN,jobTitle,isFullTime,hasPTO);

        }
    }
    class AppleInc{
        public static void main(String[] args) {


            Tester tester1 = new Tester("Zeynep", 123456, 120000,123456,"SDET",true,true);
            Tester tester2 = new Tester("Zeliha", 345676, 110000,234567,"QA",true,true);
            Developer developer1 = new Developer("Zerrin", 435678, 125000,45367,"Developer",true,true);
            Developer developer2 = new Developer("Zubeyde", 234567, 135000,346789,"Scrum master",true,true);
            Developer developer3 = new Developer("Zeliha", 456789, 125000,987654,"Developer",true,true);
            ArrayList<ScrumTeam> employees = new ArrayList<>();
            employees.addAll(Arrays.asList(tester1, tester2, developer1, developer2, developer3));
            for (ScrumTeam eachEmployee : employees){
                System.out.println(eachEmployee);
            }
        }
    }


