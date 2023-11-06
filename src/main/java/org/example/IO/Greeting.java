package org.example.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("What is your name ? ");
            String userInput = reader.readLine();
            System.out.println("Hello and Welcome " + userInput + "!");
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
