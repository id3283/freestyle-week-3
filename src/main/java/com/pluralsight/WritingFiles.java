package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

    public static void main(String[] args) {
        String fileName = "src/main/resources/out.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Roses are red.  I feel dead.");

            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
