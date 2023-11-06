package IO.UserData.UserData.UserData.UserData;

import java.util.Scanner;

public class UserColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] colors = {"Black", "White", "Blue", "Pink", "Green", "Violet"};

        System.out.println("Choose your favorite color from the list:");


        for (int i = 0; i < colors.length; i++) {
            System.out.println((i + 1) + ". " + colors[i]);
        }


        System.out.print("Enter the number of your favorite color: ");
        int choice = scanner.nextInt();


        if (choice >= 1 && choice <= colors.length) {

            String favoriteColor = colors[choice - 1];
            System.out.println("Your favorite color is: " + favoriteColor);
        } else {
            System.out.println("Invalid choice. Please select a valid color from the list.");
        }

    }
}
