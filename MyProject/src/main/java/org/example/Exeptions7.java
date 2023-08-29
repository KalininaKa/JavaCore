package org.example;

import java.util.Scanner;

public class Exeptions7 {
    public static void main(String[] args) throws ScannerExeption {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x!=0){
               throw new ScannerExeption("Введен не ноль");
                }
            }
        }
    }
