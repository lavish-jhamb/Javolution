package com.java.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UTF8Example {
    public static void main(String[] args) throws IOException {

        String data = "Hello 👋, नमस्ते, こんにちは";

        Path path = Path.of("test.txt");

        // Write data using UTF-8 Encoding
        Files.writeString(path, data);

        // Read data using UTF-8 Encoding
        String content = Files.readString(path);
        System.out.println(content);

    }
}
