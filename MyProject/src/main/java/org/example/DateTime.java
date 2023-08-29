package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date md = new Date();
        Date md2 = new Date();
        md2.setTime(169330);
        System.out.println(md);
        System.out.println(md2);
        System.out.println(md.toString());
        System.out.println(md.getTime());
        System.out.println(md.equals("Tue Aug 30 12:49:46 MSK 2033"));
        System.out.println(md.after(md2));
        System.out.println(md.before(md2));

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2023, 8, 6);
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld2.getYear());
        System.out.println(ld2.getMonth());
        System.out.println(ld2.getDayOfMonth());
        System.out.println(ld2.plusDays(4));
        System.out.println(ld2.plusYears(5));
        System.out.println(ld2.plusMonths(3));
        System.out.println(ld2.minusDays(6));
        System.out.println(ld2.minusYears(10));

        LocalTime lt1 = LocalTime.parse("08:30");
        LocalTime lt2 = LocalTime.parse("09:30");
        LocalTime lt3 = LocalTime.of(10, 20,00);
        LocalTime lt4 = LocalTime.now();
        System.out.println(ChronoUnit.HOURS.between(lt1, lt2));
        System.out.println(lt3);
        System.out.println(lt4);

    }
}
