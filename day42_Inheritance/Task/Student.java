package day42_Inheritance.Task;

public class Student extends Person {
    public long studentId;
    public String clazz;
    public void attendClass(){
        System.out.println(name+" is attending the class");
    }
    public void code(){
        System.out.println(name+ " is coding");
    }
    public void setStudentInfo(String name,int age, char gender, long studentId,String clazz){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentId=studentId;
        this.clazz=clazz;
    }
    public String toString(){
        return "Name: "+name+" student ID: "+studentId+ " class: "+ clazz;
    }

}
