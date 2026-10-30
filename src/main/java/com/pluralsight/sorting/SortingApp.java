package com.pluralsight.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingApp {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person ransell = new Person("Ransell", 23);
        people.add(ransell);

        Person josiah = new Person("Jo", 27);
        people.add(josiah);

        ransell.compareTo(josiah);

        Collections.sort(people);

    }
}
