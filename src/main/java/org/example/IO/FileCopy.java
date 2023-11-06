package org.example.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFileName = "/Users/saivelamuri/Desktop/source.txt";
        String destinationFileName = "destination.txt";

        try (FileInputStream sourceFile = new FileInputStream(sourceFileName);
             FileOutputStream destinationFile = new FileOutputStream(destinationFileName)) {

            byte[] buffer = new byte[1024];

            int bytesRead;
            while ((bytesRead = sourceFile.read(buffer)) != -1) {
                destinationFile.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
