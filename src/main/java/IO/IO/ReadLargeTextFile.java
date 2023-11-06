package IO.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeTextFile {
    public static void main(String[] args) {
        String filePath = "large_data.txt";
        int bufferSize = 1024;

        try (FileReader fileReader = new FileReader("/Users/saivelamuri/Desktop/large_data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader, bufferSize)) {

            char[] buffer = new char[bufferSize];
            int bytesRead;

            while ((bytesRead = bufferedReader.read(buffer, 0, bufferSize)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

