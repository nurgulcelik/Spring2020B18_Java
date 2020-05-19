package day42_Inheritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestData extends Data {
    public static void main(String[] args) {


        System.out.println( TestData.publicData);
        System.out.println(TestData.defaultData);
        System.out.println(TestData.protectedData);
        //System.out.println(TestData.privateData);

    }
}