package day42_Inheritance.Task3;

public class Square extends Shape {
    double side;


    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
 }