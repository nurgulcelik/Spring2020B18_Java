package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {
    /*create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
 2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)


     */
    public String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
interface Volume{

    boolean hasVolume=true;

    double calculateVolume();
}
interface PI{
    double PI = 3.14;
}
/*
 create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

 */
final class Circle extends Shape implements PI{
    public double radius;
    public Circle(double radius) {

        this.radius = radius;

        name = "Circle";
    }

    @Override
    public double calculateArea() {

        return radius*radius*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*PI;
    }
}
/* create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height

 */
    final class Cylinder extends Shape implements Volume,PI{
        public double radius;

        public double height;
        public Cylinder(double radius,double height){
            this.radius=radius;
            this.height=height;
            name="Cylinder";
        }

    @Override
    public double calculateArea() {

        return (PI * 2*radius * radius) + (height * PI * 2*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (PI * 2*radius + height);
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }
    /*create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
            Perimeter of Cylinder = 2 * (PI * diameter + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI

     */
}


