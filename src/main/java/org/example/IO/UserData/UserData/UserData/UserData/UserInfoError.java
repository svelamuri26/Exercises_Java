package org.example.IO.UserData.UserData.UserData.UserData;
import java.util.Scanner;

public class UserInfoError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please provide the following information:");


        System.out.print("Name: ");
        String name = scanner.nextLine();

        int age = 0;
        while (true) {
            System.out.print("Age: ");
            String ageInput = scanner.nextLine();

            try {
                age = Integer.parseInt(ageInput);
                if (age >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer for age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer for age.");
            }
        }


        System.out.print("Email Address: ");
        String email = scanner.nextLine();


        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();


        System.out.println("Thank you for providing the following information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + phoneNumber);


    }
}

