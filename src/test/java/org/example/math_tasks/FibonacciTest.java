package org.example.math_tasks;

import org.junit.jupiter.api.Test;

import static org.example.math_tasks.Fibonacci.getFibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> getFibonacci(null));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> getFibonacci(-1));
    }

    @Test
    void test0() {
        assertEquals(0, getFibonacci(0));
    }

    @Test
    void test3() {
        assertEquals(2, getFibonacci(3));
    }

    @Test
    void test7() {
        assertEquals(13, getFibonacci(7));
    }

    @Test
    void test13() {
        assertEquals(233, getFibonacci(13));
    }
}
