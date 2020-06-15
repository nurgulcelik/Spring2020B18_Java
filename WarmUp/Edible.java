package WarmUp;

public interface Edible {
     void eat();
}
interface Drinkable extends Edible{
     void drink();
}
 class Burger implements Edible{

      String name;
      String size;
     @Override
     public void eat() {
         System.out.println("She is eating " +name);
     }
     public Burger(String name,String size){
         this.name=name;
         this.size=size;
     }
     public String toString(){
         return "Name: "+name+", Size: "+size;
     }

}
 class IceCoffee implements Drinkable{
    public static String name="IceCoffee";
public String size;
public IceCoffee(String size){
    this.size=size;
}
public String toString(){
    return name+" size: "+size;
}

     @Override
     public void drink() {
         System.out.println("She is drinking "+name);
     }

     @Override
    public void eat() {
        System.out.println("She is eating "+size+" burger");
    }


}
        class Test{
            public static void main(String[] args) {
                Burger food= new Burger("Whopper","large");
                System.out.println(food);
                food.eat();

                IceCoffee coffee= new IceCoffee("large");
                System.out.println(coffee);
                coffee.eat();
                coffee.drink();

                    }
                }

