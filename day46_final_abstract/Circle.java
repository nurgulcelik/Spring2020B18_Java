package day46_final_abstract;

public class Circle extends Shape{
    public double radius;
    public final static double PI=3.14;
    @Override
     void Area(){// public, protected or default I can give
     double area= radius*radius*PI;
        System.out.println("Area is: " +area);

     }
     public Circle(double radius){
        this.radius=radius;
     }
    }

