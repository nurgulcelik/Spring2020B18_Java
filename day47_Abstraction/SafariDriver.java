package day47_Abstraction;

public class SafariDriver extends RemoteWebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL+" in Safari Browser");
    }
    public void quit(){
        System.out.println("Closing the Safari Browser");
    }
}
class EdgeDriver extends RemoteWebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL+" in EdgeDriver Browser");
    }
    public void quit(){
        System.out.println("Closing the EdgeDriver Browser");
    }
}
class IEDriver  extends RemoteWebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL+" in IEDriver Browser");
    }
    public void quit(){
        System.out.println("Closing the IEDriver Browser");
    }
}
