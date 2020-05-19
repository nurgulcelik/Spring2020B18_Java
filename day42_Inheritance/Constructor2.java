package day42_Inheritance;



class test{
    public test(int a){
        this(2.5);
        System.out.println("A");
    } public test(double a){
        System.out.println("C");
    }

}
public class Constructor2 extends test {
    public Constructor2(){
        super(10.5);
        System.out.println("B");
    }


    public static void main(String[] args) {
        //test obj1= new test(5);
        Constructor2 obj2=new Constructor2();
    }
}
