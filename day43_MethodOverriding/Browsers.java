package day43_MethodOverriding;

public class Browsers {
    public void openBrowser(){
        System.out.println("Open the default browser");
    }
    public void closeBrowser(){
        System.out.println("Close the default browser");
    }
}
class ChromeBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("Open the Chrome browser");
    }
    public void closeBrowser(){
        System.out.println("Close the Chrome browser");
    }
}
class FirefoxBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("Open the Firefox browser");
    }
    public void closeBrowser(){
        System.out.println("Close the Firefox browser");
    }
        }
        class OperaBrowser extends Browsers{
            public void openBrowser(){
                System.out.println("Open the Opera browser");
            }
            public void closeBrowser(){
                System.out.println("Close the Opera browser");
            }
        }
        class test extends Browsers{
            public static void main(String[] args) {
                ChromeBrowser obj1= new ChromeBrowser();
                obj1.openBrowser();
                obj1.closeBrowser();
                FirefoxBrowser obj2= new FirefoxBrowser();
                obj2.openBrowser();
                obj2.closeBrowser();
                OperaBrowser obj3= new OperaBrowser();
                obj3.openBrowser();
                obj3.closeBrowser();
            }
        }