package day42_Inheritance;



class A{
    int a= 100;
   public A(double a){
       System.out.println(this.a);
    }
}
public class SuperKeyword extends A {
    int a= 200;
    public SuperKeyword() {
        super(3.5);
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        SuperKeyword obj= new SuperKeyword();
        A obj2= new A(3.5);//output 100 200 100
    }

}
