package Warmup2;




import java.util.ArrayList;
import java.util.Arrays;

public interface onlineEducation {
    boolean onlineStudent=true;
    void attendClass();
}
interface Cybertek extends onlineEducation{
    String schoolName="Cybertek";
    boolean requiredITBackground=false;
}
class Student extends CybertekSchool implements onlineEducation{
    private String studentName;
    private int age;
    private char grade;
    private boolean has_ITBackground;
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public int getAge(){
        return age;
    }public void setAge(int age){
        this.age=age;
    }public char getGrade(){
        return grade;
    }public void setGrade(char grade){
        this.grade=grade;
    }public boolean isHas_ITBackground(){
        return has_ITBackground;
    }public void setHas_ITBackground(boolean has_ITBackground){
        this.has_ITBackground=has_ITBackground;
    }

    public Student(String studentName, int age, char grade, boolean has_ITBackground) {
        this.studentName = studentName;
        this.age = age;
        this.grade = grade;
        this.has_ITBackground = has_ITBackground;
    }

    @Override
    public void attendClass() {
        System.out.print(getStudentName()+" attends the class" );
    }
    public void takingBreaks(){
        System.out.println(getStudentName()+" takes a break ");
    }
    public void studying(){
        System.out.println(getStudentName()+" studies for the quiz");
    }

    @Override
    public String toString() {
        return "StudentName= " + studentName + ", age=" + age +
                ", grade=" + grade + ", has_ITBackground=" + has_ITBackground;
    }
}
class CybertekSchool{
    public static void main(String[] args) {

        Student student1= new Student("Zeynep",21,'A',false);
        Student student2=new Student("Zehra",25,'A',true);
        Student student3= new Student("Zeliha",28,'B',false);
        Student student4=new Student("Zerrin",30,'B',false);
        Student student5=new Student("Zekiye",35,'A',true);

        ArrayList<CybertekSchool>list=new ArrayList<>
                (Arrays.asList(student1,student2,student3,student4,student5));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        student3.studying();
        student1.takingBreaks();
        student2.attendClass();

    }
}
