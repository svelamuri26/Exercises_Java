package org.example.IO.UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;

public class BirthYear {
    public static void main(String[] args) {

        String filePath = "user_info.txt";

        try (FileReader fileReader = new FileReader("/Users/saivelamuri/Desktop/use_info.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String name = null;
            int age = 0;
            String email = null;
            String address = null;


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("Name:")) {
                    name = line.replace("Name:", "").trim();
                } else if (line.startsWith("Age:")) {
                    age = Integer.parseInt(line.replace("Age:", "").trim());
                } else if (line.startsWith("Email Address:")) {
                    email = line.replace("Email Address:", "").trim();
                } else if (line.startsWith("Address:")) {
                    address = line.replace("Address:", "").trim();
                }
            }


            int currentYear = Year.now().getValue();
            int birthYear = currentYear - age;


            System.out.println("User Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email Address: " + email);
            System.out.println("Address: " + address);
            System.out.println("Birth Year: " + birthYear);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
