package day42_Inheritance;

class Test{
    public Test(){//super
        System.out.println("SUPER CLASS DEFAULT CONSTRUCTOR");
    }
}
public class Constructor extends Test{//sub
    public Constructor(){
        System.out.println("sub class default constructor");
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();//->AB//Test obj=new Test->A
    }

}
