package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime datetime= LocalDateTime.of(2015,12,25,11,30,45);
        System.out.println(datetime);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");
        System.out.println(datetime.format(dtf));
        String str= datetime.format(dtf);
        System.out.println(str);
    }
}
