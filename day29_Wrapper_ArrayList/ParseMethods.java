package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str= "123";
        int a1=Integer.parseInt(str);
        System.out.println(str+1);//as a text,1231,"123'+1 concatenation
        System.out.println(a1+1);//as a number,124
        byte b1= Byte.parseByte(str);//primitive to primitive
        System.out.println(b1+2);
        Integer i1= (int) Byte.parseByte(str);//explicit casting,autoboxing

    }
}
