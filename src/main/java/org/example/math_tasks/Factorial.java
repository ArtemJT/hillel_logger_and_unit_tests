package org.example.math_tasks;

import org.example.logger.FileLogger;

import java.math.BigInteger;

public class Factorial {

    private Factorial() {}

    public static String getFactorial(Integer n) {
        logAction("STARTED");

        if (n == null || n < 0) {
            logAction("throws IllegalArgumentException");
            throw new IllegalArgumentException();
        }

        BigInteger binInt = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            binInt = binInt.multiply(BigInteger.valueOf(i));
        }

        return logAction(binInt.toString());
    }

    private static String logAction(String message) {
        FileLogger.startLogger(Factorial.class.getSimpleName() + " {" + message + '}');
        return message;
    }
}
