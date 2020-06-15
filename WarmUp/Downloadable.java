package WarmUp;


public interface Downloadable {
    boolean downloadable=true;
    void download();
}
interface AndroidApps extends Downloadable{
    String AppStoreName="APPLE";

}
interface AppleApps extends Downloadable{

}
abstract class Phone{
    static String brand;
    String model;
    double price;
    String size;
    abstract void calling(long number);
    abstract void texting(long number);

}
class iPhone extends Phone implements AppleApps {
    static{
        brand="iPhone";
    }
    @Override
    void calling(long phoneNumber) {
        System.out.println("iPhone is calling with " +phoneNumber );
    }

    @Override
    void texting(long phoneNumber) {
        System.out.println("iPhone is texting with " +phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Application is downloading to the "+brand);
    }
    public iPhone( String model, double price,String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }
    public void FaceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+ phoneNumber);
    }
}
class Nokia extends Phone implements AndroidApps{
    static{
        brand="Nokia";
    }
    @Override
    public void download() {
        System.out.println("Application is downloading to the "+brand );
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("Nokia is calling with " +phoneNumber);
    }

    @Override
    void texting(long phoneNumber) {
        System.out.println("Nokia is texting with " +phoneNumber);
    }
    public void breakTheFloor() {
        System.out.println(brand+" is breaking the floor");
    }

    public Nokia(String model, double price,String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }
    public void Freezing(long phoneNumber){

        System.out.println("Nokia is freezing with "+ phoneNumber);
    }

} class PhoneObjects {
    public static void main(String[] args) {
        day48_Abstraction.iPhone phone1 = new day48_Abstraction.iPhone("X", 1200, "10 inches");
        System.out.println(phone1);
        phone1.calling(9550166);
        phone1.FaceTiming(5678904);
        phone1.texting(234567);
        Nokia phone2 = new Nokia("3310", 50, "10 inches");
        System.out.println(phone2);
        phone2.calling(2345678);
        phone2.texting(34567890);
        phone2.Freezing(67785432);
    }
}