package day36_StaticBlock;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day34_CustomClass.Tester;

public class StaticBlock4 {
    static String name;
    static Tester tester1= new Tester();

int insVariable;
  static{//designed for statics only
   //gets executed as soon as the class i uploaded
   //designed to initialize static variables
     name= "Cybertek School";
     tester1.setTesterInfo("Talha",345,"QA",120000);
     tester1.setTesterInfo("Namik",123,"QA",130000);
     //insVariable=300; compile error
     // StaticBlock4 obj= new StaticBlock4();
      // do not use static block to initialize the instance variables
      //obj.insVariable=300;

  }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
        StaticBlock4 obj2= new StaticBlock4 ();
        System.out.println(obj2.insVariable);//0
    }
}




