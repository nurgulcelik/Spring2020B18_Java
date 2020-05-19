package day42_Inheritance;



class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double b){
        System.out.println("double");
    }
    public B(long a){
        this(3.5);
        System.out.println("long");
    }
}
public class InheritanceReview extends B {
    public InheritanceReview(String a){
        super(3l);
    }

    public static void main(String[] args) {
        InheritanceReview obj=new InheritanceReview("Zeynep");
        System.out.println("string");
    }
}
