package com.example.springboot.tests.demo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);

        double expected = 8.2D;

        assertEquals(expected, actual,() -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
        assertNotEquals(7.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double secondNumber = 1.4D;

        Double actual = math.subtraction(firstNumber, secondNumber);

        double expected = 2.6D;

        assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);

    }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6D;
        double secondNumber = 3D;

        Double actual = math.division(firstNumber, secondNumber);

        double expected = 2D;

        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);
    }

    @Test
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6D;
        double secondNumber = 3D;

        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.5D;

        assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")" + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);
    }

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 9D;


        Double actual = math.squareRoot(number);
        double expected = 3D;

        assertEquals(expected, actual, () -> "sqrt of " + number + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);

    }
}