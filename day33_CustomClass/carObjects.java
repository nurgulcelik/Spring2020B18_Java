package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {
      Car car1= new Car();
      car1.Brand="BMW";
      car1.model="XS";
      car1.year= 2020;
      car1.color="Red";
        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        car1.start();
        car1.drive();
        car1.getCarInfo();
        System.out.println("==============================");
        Car car2= new Car();
        car2.Brand="Toyota";
        car2.model="Corolla";
        car2.year= 2020;
        car2.color="Black";
        System.out.println(car2.Brand);//null,if we do not assign yet, the default variable appears
        System.out.println(car2.model);//null
        System.out.println(car2.year);//0
        System.out.println(car2.color);//null
      car2.start();
      car2.drive();
      car2.getCarInfo();
      System.out.println("=========================");
      Car car3= new Car();
      car3.Brand="Mercedes";
      car3.model="C Class";
      car3.year= 2020;
      car3.color="White";
      car3.getCarInfo();
      Car[] cars= {car1,car2,car3};
      cars[0].getCarInfo();
      cars[1].getCarInfo();
      cars[2].getCarInfo();

    }
}
