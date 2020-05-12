package tests;

public class Circle {
    double radius;
    double diameter;
    static double pi=3.14;
    public Circle(double radius){

        this.radius=radius;
        diameter= radius*2;

    }
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){

        return diameter*pi;
    }
    public String ToString(){
        return " Circle radius: "+radius+
                "\nArea of the Circle: "+ area()+
        "\nPerimeter of the Circle: "+ perimeter();
    }
}
class CircleObjects{
    public static void main(String[] args) {
        Circle object=new Circle(5);
        System.out.println(object);
        System.out.println(object.area());
        System.out.println(object.perimeter());

    }
}
