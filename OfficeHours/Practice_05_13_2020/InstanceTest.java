package OfficeHours.Practice_05_13_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InstanceTest {
    public static void main(String[] args) {
        Instances obj1= new Instances();
        obj1.name="MUHTAR";
        Instances obj2= new Instances();
        obj2.name="Kuzzat";
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.printName();
        obj2.printName();
    }
}
class InstanceBlock{
    public static void main(String[] args) {
        Instances obj = new Instances();
        System.out.println(obj.name);//null
    }
}