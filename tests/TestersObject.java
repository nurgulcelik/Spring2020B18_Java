package tests;

public class TestersObject {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Zeynep","SDET",120000,12345);
        Tester tester2= new Tester();
        tester2.setInfo("Talha","QA",150000,56789);
        System.out.println(tester1);
        tester1.smokeTesting();
        tester1.creatingTicket();
    }
}
