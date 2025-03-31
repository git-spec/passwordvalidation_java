package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static String[] usuals = {"1234qwer", "12345678", "password", "password1", "qwerty123", "1q2w3e4r"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        if (Main.validatePassword(password)) {
            System.out.println("This is a strong password!");
        } else {
            System.out.println("This is a week password!");
        }
    }

    /**
     * Validates the quality of an entry for a password.
     * @param password  input for a password
     * @return  true if all requirements are fulfilled
     */
    public static boolean validatePassword(String password) {
        return validateLength(password)
                && validateDigits(password)
                && validateCapitals(password)
                && validateOriginality(password)
                && !validateSpecialChars(password);
    }

    /**
    * Validates the length of an input.
    * @param input  input of user
    * @return  true if length is equal or more than 8
    */
    public static boolean validateLength(String input) {
        return input.length() >= 8;
    }

    /**
     * Validates input on digits.
     * @param input  input of user
     * @return  true if value includes digits
     */
    public static boolean validateDigits(String input) {
        return input.matches(".*\\d.*");
    }

    /**
     * Validates input on capitals.
     * @param input  input of user
     * @return  true if value includes capitals
     */
    public static boolean validateCapitals(String input) {
        return !input.equals(input.toLowerCase());
    }

    /**
     * Validates input on originality.
     * @param input  input of user
     * @return  true if value is original
     */
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

    /**
     * Validates input on special characters.
     * @param input  input of user
     * @return  true if value has no special characters
     */
    public static boolean validateSpecialChars(String input) {
        return input.matches("[A-Za-z0-9]*");
    }
}