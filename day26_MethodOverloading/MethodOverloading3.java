package day26_MethodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10,20);
        sum(1.5,2.5);
        double res=sum(10.5,2.5);
                double result=sum(120l,20l);
        System.out.println(res);
        System.out.println(result);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static double sum(double a,double b){
        return (a+b);
    }

}
