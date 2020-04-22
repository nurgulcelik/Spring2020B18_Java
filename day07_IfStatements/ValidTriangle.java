package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {
   double angle1= 30;
   double angle2= 50;
   double angle3= 100;
   short sumOfAngles= (short)( angle1+angle2+angle3);

     if (sumOfAngles==180) {
         System.out.println("The shape is a triangle");
     }
     if (sumOfAngles != 180) {
         System.out.println(" The shape is not a valid triangle");
     }
    }
}
