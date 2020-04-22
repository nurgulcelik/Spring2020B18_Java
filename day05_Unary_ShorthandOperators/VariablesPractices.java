package day05_Unary_ShorthandOperators;

public class VariablesPractices {
    public static void main(String[] args) {
  //whole number; byte,short,int,long
  //decimal number; float,double
  int a1= 100;
  float f1= (long)a1;
  // f1=100l,f1=100.0
        System.out.println(f1);
        long l1 = (long)f1;//explicit casting,l1=100
        System.out.println(l1);
        //in java; first come first serve
        String name= "cybertek";
        System.out.println(name);
        // local variables cannot be used without initializing,otherwise always compile error



    }


}
