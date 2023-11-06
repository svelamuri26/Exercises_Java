package org.example.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {
    public static void main(String[] args) {
        String inputFileName = "/Users/saivelamuri/Desktop/input.txt";
        String outputFileName = "output.txt";

        try (FileReader fileReader = new FileReader(inputFileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(outputFileName)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                fileWriter.write(line);
                fileWriter.write("\nWhat is your name? ");
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
