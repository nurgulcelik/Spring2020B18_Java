package day14_StringClass;
// valid web address must start with www,and must ends with com,edu,net or gov

public class WebAddress {
    public static void main(String[] args) {

       String website= "www.cybertek.Gov";
       website= website.toLowerCase();
       boolean validEnding=  website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov");
       if(website.startsWith("www.")&& validEnding){
           System.out.println("Valid address");
       }else{
           System.out.println("Invalid address");
       }

    }
}
