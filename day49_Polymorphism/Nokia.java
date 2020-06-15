package day49_Polymorphism;



public class Nokia extends Phone implements Phone.AndroidApps {
    static {
        brand = "Nokia";
    }
    public Nokia( String model, double price,String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }
    @Override
    public void download() {
        System.out.println("Nokia is downloading apps");
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("Nokia is calling to "+phoneNumber);
    }

    @Override
    void texting(long phoneNumber) {
        System.out.println("Nokia is texting to "+phoneNumber);
    }
}
