package day35_Static;

public class StaticVariables {
    int a2=200;//instance variable
    static int a3=300;//static variable


    public static void main(String[] args) {
        int a1=100;//local variable
        StaticVariables obj1= new StaticVariables();
        obj1.a2=1000;
        StaticVariables obj2= new StaticVariables();
        obj2.a2=2000;
        obj1.a3=4000;
        obj2.a3=5000;//after reassigned 5000
        System.out.println(obj1.a2);//1000
        System.out.println(obj2.a2);//2000
        System.out.println(obj1.a3);//4000,5000
        System.out.println(obj2.a3);//4000,5000
    }
}
