package day49_Polymorphism;



public class iPhone extends Phone implements Phone.AppleApps {
    static {
        brand = "Apple";
    }
    public iPhone( String model, double price,String size){

            this.model=model;
            this.price=price;
            this.size=size;
    }

    @Override
    public void download() {
        System.out.println("iPhone is downloading apps");
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);
    }

    @Override
    void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);
    }
    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming to "+ phoneNumber);
    }
}
