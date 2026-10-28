package com.pluralsight;

public class Errors {

    public static void main(String[] args)  {

        String[] quotes = {"To be or not", "I'm not dead yet"};

        int userChoice = 3;

        try {
            System.out.println(quotes[userChoice]);
        }
        catch (ArrayIndexOutOfBoundsException indexScrewUp) {
            System.out.println("Bad index: " + indexScrewUp.getMessage() );
        }

    }
}
