package day43_MethodOverriding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Circle extends Shape {
    public double radius;
    public static double PI=3.14;
    public Circle(double radius){
        this.radius=radius;
    }
    public void calculateArea(){
    area= radius*radius*PI;
        System.out.println("Area of the circle: "+area);
    }
    public void calculatePerimeter(){
        perimeter= 2*PI*radius;
        System.out.println("Perimeter of the circle: "+perimeter);
    }

}
