package day46_final_abstract;

public class Triangle extends Shape{
    public double base;
    public double heigth;
 @Override
    public void Area(){
        double area=base*heigth/2;
        System.out.println("Area of the triangle is: "+area);
    }
    public Triangle(double base, double heigth){
        this.base=base;
        this.heigth=heigth;
    }
}
