package org.example.IO.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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

    public static class UserInfoError {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome! Please provide the following information:");

            // Collect user's name
            System.out.print("Name: ");
            String name = scanner.nextLine();

            int age = 0; // Initialize age to 0

            // Collect and validate user's age
            while (true) {
                System.out.print("Age: ");
                String ageInput = scanner.nextLine();

                try {
                    age = Integer.parseInt(ageInput);
                    if (age >= 0) {
                        break; // Valid age, exit the loop
                    } else {
                        System.out.println("Please enter a positive integer for age.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a positive integer for age.");
                }
            }

            // Collect user's email address
            System.out.print("Email Address: ");
            String email = scanner.nextLine();

            // Collect user's phone number
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            // Display the collected information
            System.out.println("Thank you for providing the following information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email Address: " + email);
            System.out.println("Phone Number: " + phoneNumber);

            // Close the scanner when done
            scanner.close();
        }
    }
}
