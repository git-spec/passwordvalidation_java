package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PasswordGenerator {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    /**
     * Generates a random password
     * @param length        minimum length for the password
     * @param useLower      lower case for the password
     * @param useUpper      upper case for the password
     * @param useDigits     digits for the password
     * @param useSpecial    special characters for the password
     * @return  random password
     */
    public static String generatePassword(
            int length,
            boolean useLower,
            boolean useUpper,
            boolean useDigits,
            boolean useSpecial
    ) {
        StringBuilder password = new StringBuilder(length);
        Random random = new SecureRandom();
        List<String> charCategories = new ArrayList<>(4);

        if (useLower) charCategories.add(LOWER);
        if (useUpper) charCategories.add(UPPER);
        if (useDigits) charCategories.add(DIGITS);
        if (useSpecial) charCategories.add(SPECIAL);

        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        return new String(password);
    }

    public static void main(String[] args) {
        String password = generatePassword(12, true, true, true, true);
        System.out.println("Generated Password: " + password);
    }
}
