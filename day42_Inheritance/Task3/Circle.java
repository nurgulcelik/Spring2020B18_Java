package day42_Inheritance.Task3;

public class Circle extends Shape{
    static double PI = 3.14;
    double radius;




    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2*radius * PI;
    }

}
