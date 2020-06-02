package WarmUp;


public abstract class  Browser {
    public String browserName;
    public abstract void getURL(String url);
    public abstract void close();
    public abstract void maximize();

}
class ChromeBrowser extends Browser{
    public ChromeBrowser(String browserName){
        this.browserName=browserName;
    }
    @Override
    public void getURL(String url){
        System.out.println(browserName +" is opening "+ url);
    }
    @Override
    public void close(){
        System.out.println(browserName +" is closing");
    }
    public void maximize(){
        System.out.println( browserName+ " is maximized");
    }
}
class FireFoxBrowser extends Browser{
    public FireFoxBrowser(String browserName){
        this.browserName=browserName;
    }
    @Override
    public void getURL(String url){
        System.out.println(browserName =" is opening "+ url);
    }
    @Override
    public void close(){
        System.out.println(browserName+" is closing");
    }
    public void maximize(){
        System.out.println(browserName+ " is maximized");
    }
}
class OperaBrowser extends Browser{
    public OperaBrowser(String browserName){
        this.browserName=browserName;
    }
    @Override
    public void getURL(String url){
        System.out.println(browserName =" is opening "+ url);
    }
    @Override
    public void close(){
        System.out.println(browserName+" is closing");
    }
    public void maximize(){
        System.out.println(browserName+ " is maximized");
    }
}
class BrowserObjects{
    public static void main(String[] args) {
        ChromeBrowser chrome= new ChromeBrowser("Chrome");
        chrome.getURL("https://www.google.com");
        chrome.close();
        chrome.maximize();
    }
}
