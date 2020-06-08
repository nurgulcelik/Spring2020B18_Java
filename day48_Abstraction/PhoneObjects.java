package day48_Abstraction;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone phone1= new iPhone("X",1200,"10 inches");
        System.out.println(phone1);
        phone1.calling(9550166);
        phone1.FaceTiming(5678904);
        phone1.texting(234567);
        Samsung phone2= new Samsung("S8",1000,"12 inches");
        System.out.println(phone2);
        phone2.calling(2345678);
        phone2.texting(34567890);
        phone2.Freezing(67785432);
    }
}
