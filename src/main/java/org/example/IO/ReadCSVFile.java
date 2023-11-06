package org.example.IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String fileName = "/Users/saivelamuri/Downloads/Sample.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/saivelamuri/Downloads/Sample.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");

                for (String value : values) {
                    System.out.print(value + " | ");
                }

                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
