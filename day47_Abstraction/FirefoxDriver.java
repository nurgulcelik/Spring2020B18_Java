package day47_Abstraction;

public final class FirefoxDriver extends RemoteWebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL+" in Firefox Browser");
    }
    public void quit(){
        System.out.println("Closing the Firefox Browser");
    }
}
