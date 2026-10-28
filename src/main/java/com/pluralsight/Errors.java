package com.pluralsight;

public class Errors {

    public static void main(String[] args)  {

        String[] names = {"Yahir", "Behlul"};

        try {
            System.out.println("Entering try block");

            System.out.println(names[2]);
            System.out.println("Exiting try block");
        }
        catch (ArrayIndexOutOfBoundsException indexScrewUp) {
            System.out.println("Bad index: " + indexScrewUp.getMessage() );
            System.out.println("Can't print that student... continuing.");
        }

    }
}
