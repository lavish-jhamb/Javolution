package com.java.practice.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadStringExample {

    public static void main(String[] args) throws IOException {

        // Path to the file
        Path filePath = Path.of("example.txt");

        // Read the content of file
        String content = Files.readString(filePath);

        // print the file content
        System.out.println("File Content: ");
        System.out.println(content);
    }

}
