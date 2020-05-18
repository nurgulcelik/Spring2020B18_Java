package day41_Inheritance.Task2;

public class AccountObject {
    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();
        obj.showBalance();
        obj.accountHolder="Enes";
        obj.accountNumber=1234;
        obj.showBalance();
        obj.deposit(20000);
        obj.showBalance();
        obj.withdraw(1000);
        System.out.println(obj);
        SavingAccount saving=new SavingAccount();
        System.out.println(SavingAccount.interestRate);
        System.out.println(saving);
        saving.deposit(3000);
        saving.showBalance();


    }
}
