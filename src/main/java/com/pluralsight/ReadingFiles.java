package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

    public static void main(String[] args) {
        String userInput = "poem.txt";
        String fileName = "src/main/resources/" + userInput;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line = bufReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Yo, no file named: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem trying to read a line.  " +
                    "I don't know, no input or maybe no output 🤷🏼‍♂️");
        }


    }
}
