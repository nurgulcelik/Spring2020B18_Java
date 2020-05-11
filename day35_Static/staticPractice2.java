package day35_Static;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class staticPractice2 {
  String brand;
  String model;
  static boolean hasWheels;
  public void printBrand(){

    System.out.println("Mercedes");//IF THERE IS STATIC,I can not use directly the instance variable
  }
  public void printModel(){

    System.out.println(model);
  }

  public static void main(String[] args) {
    hasWheels=true;

    System.out.println(hasWheels);
    staticPractice2 yeni=new staticPractice2();

    yeni.printBrand();
    yeni.printModel();
    yeni.brand="BMW";
    System.out.println(yeni.brand);


  }
}
