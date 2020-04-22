package day14_StringClass;

public class practice {
    public static void main(String[] args) {
    String gmail= "cybertekschool@gmail.com";
    String userInputGmail= "CybertekScholl.gmail.com";
    boolean result= gmail.equalsIgnoreCase(userInputGmail);
    if(result){
        System.out.println("logged in");
    }
        System.out.println("===========================");
    // every website has "www." at the beginning of the web address
    String webAdress= "Www.amazon.com";
    webAdress=webAdress.toLowerCase();
    if(webAdress.startsWith("www.")){
        System.out.println("valid");
        String email="CybertekSchool.@Yahoo.com";
        if(email.endsWith("gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("invalid gmail");
        }
        /*
        write a program that can validate if web address is valid
        valid web address:
        must start with www,
        must ends with .com,or .edu, or .net, or .Gov
         */








    }



    }


}
