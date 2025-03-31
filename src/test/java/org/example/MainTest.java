package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void validateLength_shouldReturnFalse_WhenInputIsStringLength6() {
        // GIVEN
        String input = "abc123";
        // WHEN
        boolean actual = Main.validateLength(input);
        // THEN
        assertFalse(actual);
    }

    @Test
    void validateLength_shouldReturnTrue_WhenInputIsStringLength8() {
        // GIVEN
        String input = "abc1234%";
        // WHEN
        boolean actual = Main.validateLength(input);
        // THEN
        assertTrue(actual);
    }

    @Test
    void validateDigits_shouldReturnTrue_WhenInputStartsWithDigit() {
        // GIVEN
        String input = "1abc234%";
        // WHEN
        boolean actual = Main.validateDigits(input);
        // THEN
        assertTrue(actual);
    }
}