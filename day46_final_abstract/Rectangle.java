package day46_final_abstract;

public class Rectangle extends Shape{
    public double width;
    public double length;
    @Override
    public void Area(){

        double area = width*length;
        System.out.println("Area is: "+ area);
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
}
