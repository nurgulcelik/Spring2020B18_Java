package day47_Abstraction;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        String URL= "https://www.google.com";
        driver.get(URL);
        driver.quit();
        FirefoxDriver driver1= new FirefoxDriver();
        driver1.get(URL);
        driver1.quit();
        OperaDriver driver2= new OperaDriver();
        driver1.get(URL);
        driver1.quit();
    }
}
