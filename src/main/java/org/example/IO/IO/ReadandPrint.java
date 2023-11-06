package org.example.IO.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadandPrint {

    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName = "/Users/saivelamuri/Desktop/input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/saivelamuri/Desktop/input.txt"))) {
            System.out.println(reader.readLine());

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

