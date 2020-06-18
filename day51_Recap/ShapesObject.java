package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesObject {
    /*create a class named ShapeObjects
               1. create two circle and two Cylinder' objects
               2. create an ArrayList that can contain  all those objects
   Note:   Volume of Cylinder = PI * radius * radius * height
           Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
           Perimeter of Cylinder = 2 * (PI * diameter + height)
           Area of Circle = PI * radius * radius
           Perimeter of Circle = 2 * radius * PI

    */
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3.5);
        Cylinder cylinder1 = new Cylinder(4, 5);
        Cylinder cylinder2 = new Cylinder(3, 4);
        Shape shape1=new Circle(4.5);
        shape1.calculateArea();
       // obj1.name;

        Circle circle3= (Circle)shape1;
        System.out.println( circle3.name);
        Shape shape2=new Cylinder(3.5,5);
        ((Cylinder)shape2).calculateVolume();
        ArrayList<Shape> list = new ArrayList<>();
        //  (Arrays.asList(circle1, circle2, cylinder1, cylinder2));
        list.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2));
        for(Shape eachObject:list){
            System.out.println(eachObject.name+eachObject.calculateArea());
        }
        System.out.println("=================================");
       double d=  list.get(2).calculateArea();
       double e=  ((Cylinder) (list.get(3))).calculateVolume();
        System.out.println(e);
        Shape s1= new Circle(3);
        System.out.println(((Circle)s1).radius);//downcasting

    }
}
