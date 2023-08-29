package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions4 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("wdad");
        Scanner scanner = new Scanner(file);
    }
}
