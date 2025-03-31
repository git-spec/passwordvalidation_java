package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static boolean validateLength(String input) {
        return input.length() >= 8;
    }

    public static boolean validateDigits(String input) {
        return input.matches(".*\\d.*");
    }
}