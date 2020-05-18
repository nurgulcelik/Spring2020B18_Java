package tests;

public class StoreProduct {
    String label;
    int price;
    String category="misc";
    boolean hasExpiration=false;
    int stock=0;

    public StoreProduct(){}
    public StoreProduct(String label,int price){

        this.label=label;
        this.price=price;

    }
    public StoreProduct(String label,int price,int stock){

        this.label=label;
        this.price=price;
        this.stock=stock;
    }
    public StoreProduct(String label,int price,String category,boolean hasExpiration){
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.label=label;
        this.price=price;

    }
    public StoreProduct(String label,int price,String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    public void expired(boolean hasExpiration){
        this.hasExpiration=hasExpiration;
        if(hasExpiration){
            stock=0;
        }
    }

    public boolean sale(int quantity){

        if(stock>=quantity){
            stock=stock-quantity;
            return true;
        }else{
            return false;
        }
    }
    public double getDiscountedPrice(double discount){

        return price*(1-discount);
    }

    public String toString(){
        return "Label: "+label+", Category: "+category+", Price: "+price+", Stock: "+stock+", Expiration: " +hasExpiration;
    }
    public static void main(String[] args)
    {
        StoreProduct obj=new StoreProduct();
        System.out.println(obj);
        StoreProduct obj2=new StoreProduct("Milk",5);
        System.out.println(obj2);
        StoreProduct obj3=new StoreProduct("Milk",5,2);
        System.out.println(obj3);
        StoreProduct obj4=new StoreProduct("Milk",5,"Dairy product",false);
        System.out.println(obj4);
        StoreProduct obj5=new StoreProduct("Milk",5,"Dairy product",false,2);
        System.out.println(obj5);

    }
}


