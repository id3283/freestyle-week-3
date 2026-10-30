package com.pluralsight.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateApp {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);

// Specify the date/time format you will want to use

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);

    }
}
