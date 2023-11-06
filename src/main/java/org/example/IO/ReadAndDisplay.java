package org.example.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndDisplay {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a line of text: ");
            String userInput = reader.readLine();
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}

