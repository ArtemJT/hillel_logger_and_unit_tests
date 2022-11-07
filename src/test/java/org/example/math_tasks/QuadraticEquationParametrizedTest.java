package org.example.math_tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuadraticEquationParametrizedTest {

    @ParameterizedTest
    @MethodSource("testNoRootsCases")
    void testNoRoot(double a, double b, double c) {
        assertEquals("no roots", QuadraticEquation.solveQuadraticEquation(a, b, c));
    }

    public static Stream<Arguments> testNoRootsCases() {
        return Stream.of(
                Arguments.of(1.1, 2.2, 3.3),
                Arguments.of(3.1, 2.2, 1.3),
                Arguments.of(2.1, 3.2, 4.3),
                Arguments.of(4.1, 3.2, 2.3));
    }

    @ParameterizedTest
    @MethodSource("testOneRootCases")
    void testOneRoot(double a, double b, double c, String expected) {
        assertEquals(expected, QuadraticEquation.solveQuadraticEquation(a, b, c));
    }

    public static Stream<Arguments> testOneRootCases() {
        return Stream.of(
                Arguments.of(1.0, 4.0, 4.0, "-2.0"),
                Arguments.of(1.0, 12.0, 36.0, "-6.0"),
                Arguments.of(1.0, 2.0, 1.0, "-1.0"),
                Arguments.of(4.0, -20.0, 25.0, "2.5")
        );
    }

    @ParameterizedTest
    @MethodSource("testTwoRootsCases")
    void testTwoRoots(double a, double b, double c, String expected) {
        assertEquals(expected, QuadraticEquation.solveQuadraticEquation(a, b, c));
    }

    public static Stream<Arguments> testTwoRootsCases() {
        return Stream.of(
                Arguments.of(1.0, -2.0, -3.0, "-1.0 3.0"),
                Arguments.of(-1.0, -2.0, 15.0, "3.0 -5.0"),
                Arguments.of(2.0, 5.0, -3.0, "-3.0 0.5"),
                Arguments.of(2.0, -3.0, 1.0, "0.5 1.0")
        );
    }

    @ParameterizedTest
    @MethodSource("testZeroACases")
    void testZeroA(double a, double b, double c) {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solveQuadraticEquation(a, b, c));
    }

    public static Stream<Arguments> testZeroACases() {
        return Stream.of(
                Arguments.of(0.0, -2.0, -3.0),
                Arguments.of(0.0, -1.0, -4.0)
        );
    }
}
