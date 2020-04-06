package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Test
    @DisplayName("FizzBuzz should return \"1\" for 1 because is not dividable by 3 and/or 5")
    public void testFizzBuzzReturnsNumber1() {
        String result = FizzBuzz.fizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    @DisplayName("FizzBuzz should return \"2\" for 2 because is not dividable by 3 and/or 5")
    public void testFizzBuzzReturnsNumber2() {
        String result2 = FizzBuzz.fizzBuzz(2);
        assertEquals("2", result2);
    }

    @Test
    @DisplayName("FizzBuzz should return \"7\" for 7 because is not dividable by 3 and/or 5")
    public void testFizzBuzzReturnsNumber7() {
        String result3 = FizzBuzz.fizzBuzz(7);
        assertEquals("7", result3);
    }

    @Test
    @DisplayName("FizzBuzz should return \"Fizz\" for 3 because it is dividable by 3")
    public void testFizzBuzzReturnsFizz() {
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("FizzBuzz for null should throw an error")
    public void testFizzBuzzWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(null);
        });
    }

    @Test
    @DisplayName("FizzBuzz for laaarge numbers")
    public void testFizzBuzzLargeNumber() {
        String result = FizzBuzz.fizzBuzz(2_000_001);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("FizzBuzz for laaarge numbers2")
    public void testFizzBuzzLargeNumber2() {
        String result = FizzBuzz.fizzBuzz(2_000_002);
        assertEquals("2000002", result);
    }

}