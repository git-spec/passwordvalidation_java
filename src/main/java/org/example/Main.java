package org.example;

import java.util.Objects;

public class Main {
    static String[] usuals = {"1234qwer", "12345678", "password", "password1", "qwerty123", "1q2w3e4r"};

    public static void main(String[] args) {
        System.out.println(Main.validateOriginality("Hello World!"));
    }

    public static boolean validateLength(String input) {
        return input.length() >= 8;
    }

    public static boolean validateDigits(String input) {
        return input.matches(".*\\d.*");
    }

    public static boolean validateCapitals(String input) {
        return !input.equals(input.toLowerCase());
    }

    public static boolean validateOriginality(String input) {
        boolean isOriginal = true;
        for (String usual: usuals) {
            if (Objects.equals(usual, input)) {
                isOriginal = false;
                break;
            }
        }
        return isOriginal;
    }

    public static boolean validateSpecialChars(String input) {
        return input.matches("[A-Za-z0-9]*");
    }
}