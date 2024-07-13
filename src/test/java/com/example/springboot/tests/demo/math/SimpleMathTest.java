package com.example.springboot.tests.demo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);

        assertEquals(8.2D, actual, "6.2+2 did not produce 8.2");
        assertNotEquals(7.2D, actual, "6.2+2 did produce 8.2");
        assertNotNull(actual);
    }

    @Test
    void subtraction() {
    }

    @Test
    void division() {
    }

    @Test
    void mean() {
    }

    @Test
    void squareRoot() {
    }
}