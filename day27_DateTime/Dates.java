package day27_DateTime;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);
         LocalDate birthday= LocalDate.of(1975,3,1) ;
         boolean result=date1.isAfter(birthday);
         boolean result2= date1.isBefore(birthday);
         boolean result3= date1.isEqual(birthday);
         boolean result4= birthday.isLeapYear();
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("===============================");
        LocalDate now= LocalDate.now();//2020-04-23
        System.out.println("Today is: "+now);
        LocalDate birthday1= LocalDate.of(1990,04,25);
        System.out.println(birthday1);
            String str= now.toString();

        System.out.println(str.replaceAll("-"," "));
        }
    }


