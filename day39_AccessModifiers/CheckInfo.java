package day39_AccessModifiers;


public class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+ PersonalInfo.gender);
      //  System.out.println("Grade: "+ PersonalInfo.grade);
       // System.out.println("SSN: "+ PersonalInfo.SSN);
        //System.out.println("ID: "+PersonalInfo.ID);
        System.out.println("Grade: "+PersonalInfo.grade);
        PersonalInfo obj= new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);
    }
}
