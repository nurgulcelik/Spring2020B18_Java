package day42_Inheritance.Task3;

public class Rectangle extends Shape {
double width;
double length;
    public double area() {
        return width*length;
    }

    public double perimeter() {
        return 2*(width+length);
    }
}
