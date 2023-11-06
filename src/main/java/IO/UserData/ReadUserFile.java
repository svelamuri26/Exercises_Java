package IO.UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUserFile {
    public static void main(String[] args) {

        String filePath = "user_info.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (line.startsWith("Name:") || line.startsWith("Age:") || line.startsWith("Email Address:") || line.startsWith("Address:")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
