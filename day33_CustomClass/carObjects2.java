package day33_CustomClass;
import java.util.*;
public class carObjects2 {
    public static void main(String[] args) {
     Car car1=new Car();
      car1.setCarInfo("BMW","XS",2020,"Red");
      car1.getCarInfo();
      Car car2= new Car();
      car2.setCarInfo("Toyota","Corolla",2020,"Black");
      Car car3= new Car();
      car2.getCarInfo();
      car3.setCarInfo("Mercedes","C Class",2020,"White");
      Car car4= new Car();
      car3.getCarInfo();
      car4.setCarInfo("Audi","Q7",2019,"Gray");
      car4.getCarInfo();
        System.out.println("====================================");
        Car[] cars={car1,car2,car3,car4};
        for(int i=0;i<cars.length;i++){
          cars[i].getCarInfo();
        }
        System.out.println("=====================================");
        for(Car eachCar : cars){
            eachCar.getCarInfo();
        }
        System.out.println("===================================");
        System.out.println(car1);
        ArrayList<Integer>list1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);


    }
}
