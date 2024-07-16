package com.example.springboot.tests.demo.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    /*
    * Tests naming convention
    *  - test[SYSTEM UNDER TEST_[CONDITION OR STATE CHANGE]_[EXPECTED RESULT]
    *  - Ex:
    *       testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo()
     * */
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);

        double expected = 8.2D;

        assertEquals(expected, actual,() -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
        assertNotEquals(7.2D, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 4 - 1.4 = 2.6")
    void testSubtraction() {
        double firstNumber = 4D;
        double secondNumber = 1.4D;

        Double actual = math.subtraction(firstNumber, secondNumber);

        double expected = 2.6D;

        assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);

    }

    @Test
    @DisplayName("Test 6 / 3 = 2")
    void testDivision() {
        double firstNumber = 6D;
        double secondNumber = 3D;

        Double actual = math.division(firstNumber, secondNumber);

        double expected = 2D;

        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);
    }

    @Disabled("TODO: We need still work on it!")
    @Test
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {

        System.out.println("Test Division by Zero");
        fail();
    }
    @Test
    @DisplayName("Test (6 + 3) / 2 = 4.5")
    void testMean() {
        double firstNumber = 6D;
        double secondNumber = 3D;

        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.5D;

        assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")" + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);
    }

    @Test
    @DisplayName("Test Square Root of 9 = 3")
    void testSquareRoot() {
        double number = 9D;


        Double actual = math.squareRoot(number);
        double expected = 3D;

        assertEquals(expected, actual, () -> "sqrt of " + number + " did not produce " + expected + "!");
        assertNotNull(actual);
        assertNotEquals(5.4D, actual);

    }
}