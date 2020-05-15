package day40_Encapsulation;

public class CredentialObject {
    public static void main(String[] args) {
        Credentials Annafacebook=new Credentials();
        Annafacebook.setUserName("A.Paulira");
        Annafacebook.setPassword("12345");
        System.out.println(Annafacebook.getUserName());
        System.out.println(Annafacebook.getPassword());
    }
}
