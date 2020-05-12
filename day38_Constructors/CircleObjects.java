package day38_Constructors;

import java.text.DecimalFormat;

public class CircleObjects {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.000");
        double r=5.5;
        Circle circle1= new Circle(r);
        double areaOfCircle=circle1.area();

        System.out.println(df.format(areaOfCircle));
        System.out.println(circle1);
    }
}
