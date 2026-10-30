package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatting {

    public static void main(String[] args) {

        LocalDateTime nowish = LocalDateTime.now();

        String dateString = "10/05/1968";

        DateTimeFormatter usFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate later = LocalDate.parse("10/05/1968", usFormat);

        String output = later.format(usFormat);

        double pi = 3.14159265359;
        String formattedNumber = String.format("%.2f", pi);

        System.out.println(formattedNumber);
    }
}
