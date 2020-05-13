package OfficeHours.Practice_05_13_2020;
/*
instance method:
    Do not use static when creating method: public void methodName(){}
    can call ALL static variables and methods
    can call ALL instance variables and other methods
static method:
    must use STATIC word when creating method: public static void methodName(){}
    can call ONLY static variables and methods
    can NOT call instance variables or methods
    main method = static : can call statics - variables and methods
                            can NOT call instance variables and methods directly
                            must create objects to call instance variables/methods through objects

 */
public class Instances {
    String name;
  //  {
      //  name="Zuura";if we dont use instance block, i cannot use the same object
    //}

    public static void main(String[] args) {
        Instances obj= new Instances();
        obj.name="Zuura";
    }
    public void printName(){
        int name=100;
        System.out.println("Name is : "+this.name);
    }
}
