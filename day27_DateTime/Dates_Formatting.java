package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern(" EEE MM/dd/yy");
        LocalDate date1= LocalDate.now();
        System.out.println(date1.format(dtf));
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern(" EEEE MMM/dd/yyyy");
        LocalDate date2= LocalDate.of(1975,03,01);
        String str2= date2.format(dtf2);
        System.out.println(str2);
    }
}
