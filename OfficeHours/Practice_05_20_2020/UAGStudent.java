package OfficeHours.Practice_05_20_2020;

public class UAGStudent {
    String name;
    int grade;
     static String principalName="Ms.McKoy";
    String studentID;
    static int nextID=100;
    public UAGStudent(String name,int grade){
        this.name=name;
        this.grade=grade;
        studentID=this.name.substring(0,1).toUpperCase()+(nextID++);

    }
    public static void newPrincipal(String principalName){
        UAGStudent.principalName=principalName;
    }
    public static void resetID(){
        nextID=100;
    }public String toString(){
        return name+" "+studentID;
    }

    public static void main(String[] args) {
        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);
        System.out.println( "a101"+s1.principalName);
        System.out.println(s1.studentID);
        System.out.println(s2.studentID);
        System.out.println(s3.studentID);

        UAGStudent.newPrincipal("Mr. McKoy");
        System.out.println(s1.principalName);

        UAGStudent.resetID();
        UAGStudent s4 = new UAGStudent("kevin",11);
        System.out.println(s4.studentID);
        System.out.println(s4.toString());

    }

    }



