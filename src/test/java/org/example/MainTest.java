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
}