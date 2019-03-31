package pl.jpa;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        LocalTime now = LocalTime.now();
        System.out.println(now);

    }

}
