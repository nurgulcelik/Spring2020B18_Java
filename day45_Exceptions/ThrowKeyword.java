package day45_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword {
    public static void main(String[] args) {
        NoSuchElementException obj=new NoSuchElementException();
        //throw obj;
        //throw new NoSuchElementException();// after this line
        boolean breakTime= true;
        if(breakTime) {
            throw new RuntimeException("It is break time, we should break");
        }
    }
}
