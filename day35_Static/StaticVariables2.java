package day35_Static;

public class StaticVariables2 {
    int instanceVariable;
    static int staticVariable;


    public static void main(String[] args) {
StaticVariables2 obj1= new StaticVariables2();
obj1.instanceVariable=300;
obj1.staticVariable=400;

StaticVariables2 obj2= new StaticVariables2();
        System.out.println(obj1.instanceVariable);//300
        System.out.println(obj2.instanceVariable);//0 default value
        System.out.println(obj1.staticVariable);//400
        System.out.println(obj2.staticVariable);//400
        System.out.println(StaticVariables2.staticVariable);//
    }
}