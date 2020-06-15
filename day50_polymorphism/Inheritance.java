package day50_polymorphism;

public class Inheritance {
    public int publicInt=100;
    protected int protectedInt=200;
    int defaultInt=300;
    private int privateInt=400;
}
class Data extends Inheritance{
    public static void main(String[] args) {
        Data obj=new Data();
        System.out.println(obj.defaultInt);
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
    }
}