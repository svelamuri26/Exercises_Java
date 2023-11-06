package IO.UserData.UserData.UserData.UserData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserFile {
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

        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);


        writeUserInfoToFile(name, age, email, phoneNumber, address);


    }


    private static void writeUserInfoToFile(String name, int age, String email, String phoneNumber, String address) {
        try (FileWriter fileWriter = new FileWriter("user_info.txt")) {
            fileWriter.write("User Information:\n");
            fileWriter.write("Name: " + name + "\n");
            fileWriter.write("Age: " + age + "\n");
            fileWriter.write("Email Address: " + email + "\n");
            fileWriter.write("Phone Number: " + phoneNumber + "\n");
            fileWriter.write("Address: " + address);
            System.out.println("User information written to user_info.txt.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
