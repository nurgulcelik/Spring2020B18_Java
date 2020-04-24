package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
        LocalDate date= LocalDate.of(2020,3,20);
        LocalTime time= LocalTime.of(11,25,30);
        LocalDateTime dt2=LocalDateTime.of(date,time);
        System.out.println(dt2);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalDateTime dateTime=LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime);
    }
}
