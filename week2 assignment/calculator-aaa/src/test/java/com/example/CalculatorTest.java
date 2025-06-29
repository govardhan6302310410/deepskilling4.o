package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // ✅ Common object for all tests
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        // Arrange
        int a = 10, b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        // Arrange
        int a = 6, b = 7;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(42, result);
    }

    @Test
    void testDivide() {
        // Arrange
        int a = 20, b = 4;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        // Assert exception
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
