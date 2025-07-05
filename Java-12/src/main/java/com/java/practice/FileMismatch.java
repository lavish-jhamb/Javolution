package com.java.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

    public static void main(String[] args) throws IOException {
        Path file1 = Path.of("../data/File-1.txt");
        Path file2 = Path.of("../data/File-2.txt");

        long mismatch = Files.mismatch(file1, file2);

        if(mismatch == -1L)  {
            System.out.println("Files are identical");
        } else {
            System.out.println("Files differ at byte position: " + mismatch);
        }

    }
}
