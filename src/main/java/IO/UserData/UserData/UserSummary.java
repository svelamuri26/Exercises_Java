package IO.UserData.UserData;

import java.time.Year;
import java.util.Scanner;

public class UserSummary {
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

        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;


        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();


        System.out.print("Choose your favorite color (1 for Black, 2 for White, 3 for Blue , 4 for Pink , 5 for Green , 6 for Violet): ");
        int colorChoice = scanner.nextInt();
        scanner.nextLine();

        String favoriteColor = getColorByChoice(colorChoice);


        System.out.println("User Information Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Favorite Color: " + favoriteColor);

        scanner.close();
    }

    public static String getColorByChoice(int choice) {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange"};
        if (choice >= 1 && choice <= colors.length) {
            return colors[choice - 1];
        }
        return "Unknown";
    }
}
