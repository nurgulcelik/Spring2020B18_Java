package day37_Constructors;

public class CybertekStudents {
    static String schoolName="Cybertek university";
    String name;
    String studentName;
    int groupNumber;
    String batch;
    public CybertekStudents(String studentName,int groupNumber,String batch){
        //schoolName="Cybertek University";
        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;
    }
    public String toString(){
        return "School name: " +schoolName+", Student name: "+studentName+
                ", Batch: "+ batch+ ", Group Number: "+groupNumber;
    }
}
class CybertekObjects{
    public static void main(String[] args) {
        CybertekStudents students1= new CybertekStudents("Nurgul",7,"Batch 18");
        students1.schoolName="Cybertek School";
        CybertekStudents students2=new CybertekStudents("Zuura",7,"Batch 18");
        CybertekStudents students3=new CybertekStudents("Zarina",7,"Batch 18");
        System.out.println(students1);
        System.out.println(students2);
        System.out.println(students3);
    }
}
