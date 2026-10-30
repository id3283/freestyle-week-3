package com.pluralsight.dates;

public class MyDate {
    int day;
    int year;
    int month;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    private MyDate(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public static MyDate today() {
        MyDate todaysDate = new MyDate(29, 2026,10);
        return todaysDate;
    }

}
