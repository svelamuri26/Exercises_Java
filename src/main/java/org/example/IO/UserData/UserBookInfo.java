package org.example.IO.UserData;
import java.util.Scanner;

public class UserBookInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();


        System.out.println("Enter information about your favorite book:");
        System.out.print("Title: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Publication Year: ");
        int bookPublicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Display user information
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);


        System.out.println("Favorite Book Information:");
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Publication Year: " + bookPublicationYear);


    }
}
