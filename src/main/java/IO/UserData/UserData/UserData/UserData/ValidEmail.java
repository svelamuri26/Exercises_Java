package IO.UserData.UserData.UserData.UserData;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email address is valid.");
        } else {
            System.out.println("Invalid email address format.");
        }

    }

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(emailRegex);


        return pattern.matcher(email).matches();
    }
}
