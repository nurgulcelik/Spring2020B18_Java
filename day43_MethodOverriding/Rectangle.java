package day43_MethodOverriding;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double length,double width) {
        this.length=length;
        this.width=width;
    } public void calculateArea(){
       area = width*length;
        System.out.println("Area of the rectangle: "+area);
    }
    public void calculatePerimeter(){
        perimeter=2*(width+length);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}