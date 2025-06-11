package com.java.practice.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteStringExample {

    public static void main(String[] args) throws IOException {

        // Path to the file
        Path filePath = Path.of("example.txt");

        // Content to write
        String content = "Hello, Java 11! This is an example of Files.writeString().";

        // Write the content to the file
        Files.writeString(filePath, content);

        // Append additional content to the file (optional)
        Files.writeString(filePath, "\nAnother line to demonstrate appending.", StandardOpenOption.APPEND);

        System.out.println("File written successfully");

    }

}
