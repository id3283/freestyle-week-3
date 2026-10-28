package com.pluralsight;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingFiles {

    public static void main(String[] args) {

        String userInput = "poem.txt";
        String fileName = "src/main/resources/" + userInput;

        try {
            FileReader fileReader = new FileReader(fileName);
            System.out.println("Seems to have opened the file");
        }
        catch (FileNotFoundException e) {
            System.out.println("Yo, no file named: " + e.getMessage());
        }

    }
}
