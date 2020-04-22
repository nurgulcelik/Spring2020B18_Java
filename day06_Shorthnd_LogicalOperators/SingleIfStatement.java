package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = true; //true,
        //codes only get executed if it is true
        if (coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }
        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println(" Buy more toilet paper");
            System.out.println(" Buy more water");
            System.out.println(" Stay at home");
            System.out.println("Do more java coding");
        }
        System.out.println("=================================");
        int a = 100;
        boolean evenNumber = a % 2 == 0;
        if (evenNumber) {
            System.out.println(a + " is an even number");
        }
        boolean oddNumber = a % 2 != 0;
        if (oddNumber) {
            System.out.println(a + " is an odd number");
        }




    }

}
