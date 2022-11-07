package org.example.math_tasks;

import org.junit.jupiter.api.Test;

import static org.example.math_tasks.Factorial.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(null));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-1));
    }

    @Test
    void test0() {
        assertEquals("1", getFactorial(0));
    }

    @Test
    void test3() {
        assertEquals("6", getFactorial(3));
    }

    @Test
    void test7() {
        assertEquals("5040", getFactorial(7));
    }

    @Test
    void test13() {
        assertEquals("6227020800", getFactorial(13));
    }
}
