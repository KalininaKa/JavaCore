package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions3 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("text");
        Scanner scanner = new Scanner(file);
    }
}
