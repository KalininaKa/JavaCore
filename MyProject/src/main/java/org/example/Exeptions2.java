package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions2 {
    public static void main(String[] args) {
        File file = new File("text");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try/catch");
    }
}
