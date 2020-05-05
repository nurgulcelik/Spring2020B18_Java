package day33_CustomClass;

public class Carpet {
int width;
int length;
double unitPrice;
boolean isPersian;
public void customOrder(int width,int length,double unitPrice, boolean isPersian){
  this.length=length;
  this.width=width;
  this.isPersian=isPersian;
  this.unitPrice=unitPrice;
}
public double calcCost() {
    if (isPersian) {
        return (width + length) * unitPrice + 200;
    } else {
        return (width + length) * unitPrice;
    }
}
public String toString(){
        if(isPersian) {
            return "The persian carpet's width: " + width + ", and length is : " +length+ "\nTotal Price: $" + calcCost();
        }else{
            return "The non-persian carpet's width: "+ width + ", and length is : "+length+ "\nTotal Price: $" + calcCost();
    }
}






    public static void main(String[] args) {

    }

}

