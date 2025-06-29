package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils math = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(7, math.add(3, 4));
        assertNotEquals(6, math.add(2, 2));
    }

    @Test
    public void testIsEven() {
        assertTrue(math.isEven(4));
        assertFalse(math.isEven(5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    }
}
