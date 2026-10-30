package com.pluralsight;

import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");

        for (String value : statesAndCapitals.values()) {
            System.out.println(value);
        }
    }
}
