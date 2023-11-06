package IO.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargetextFilewithTime {
    public static void main(String[] args) {
        String filePath = "large_data.txt";
        int bufferSize = 1024;

        long startTime = System.currentTimeMillis();

        try (FileReader fileReader = new FileReader("/Users/saivelamuri/Desktop/large_data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader, bufferSize)) {

            char[] buffer = new char[bufferSize];
            int bytesRead;

            while ((bytesRead = bufferedReader.read(buffer, 0, bufferSize)) != -1) {

            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Reading the file took " + elapsedTime + " milliseconds.");
    }
}

