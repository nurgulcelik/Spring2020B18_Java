package day49_Polymorphism;



public abstract class Phone {
    /*
      1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
 5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
     */
    interface Downloadable {
        boolean downloadable=true;
        void download();
    }
    interface AndroidApps extends Downloadable {
        String AppStoreName="Android";

    }
    interface AppleApps extends Downloadable {
        String AppStoreName="Apple";
    }

       public static String brand;
        public String model;
        public double price;
        public String size;
        abstract void calling(long number);
        abstract void texting(long number);
        public String toString(){
            return brand+" Model: "+model+" Size: "+size+ " Price: $ "+price;
        }

    }


