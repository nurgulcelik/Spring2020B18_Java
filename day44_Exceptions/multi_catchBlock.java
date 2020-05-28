package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bound exception");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }catch(RuntimeException e){
            System.out.println("runtime");
        }catch(Exception e){
            System.out.println("exception");
        }
    }
}
