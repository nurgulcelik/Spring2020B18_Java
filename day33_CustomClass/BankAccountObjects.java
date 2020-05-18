package day33_CustomClass;

import day41_Inheritance.BankAccount;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount Zeynep= new BankAccount("Zeynep","Celik");
        System.out.println(Zeynep.getAccountHolder());
        Zeynep.checkBalance();
        Zeynep.depositing(120);
        Zeynep.checkBalance();
        Zeynep.withdrawing(80);
        System.out.println(Zeynep);
    }
}
