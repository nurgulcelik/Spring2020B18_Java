package day36_StaticBlock;

import tests.Developer;

public class HumanResources {
    static Developer dev1= new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

/*
    public static void main(String[] args) {
        dev1.setInfo("Enes", "Senior Developer", 150000, 12345);
    }
 */
static{

    dev1.setInfo("Enes", "Senior Developer", 150000, 12345);
    dev2.setInfo("Talha","Junior Developer",120000,67890);
}
}