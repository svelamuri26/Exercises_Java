package IO.UserData.UserData;

import java.io.FileInputStream;
import java.io.IOException;

public class UserPhone {
    public static void main(String[] args) {
        String filePath = "user_info.txt";

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                String[] lines = data.split("\n");
                for (String line : lines) {
                    if (line.startsWith("Phone Number:")) {
                        String phoneNumber = line.replace("Phone Number: ", "");
                        System.out.println("Phone Number: " + phoneNumber);
                    } else if (line.startsWith("Address:")) {
                        String address = line.replace("Address: ", "");
                        System.out.println("Address: " + address);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
