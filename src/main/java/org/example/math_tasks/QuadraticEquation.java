package org.example.math_tasks;

import org.example.logger.FileLogger;

import java.util.Locale;

public class QuadraticEquation {

    private QuadraticEquation() {}

    public static String solveQuadraticEquation(double a, double b, double c) {
        String message = String.format(Locale.US, "{%,+.1fx%c %,+.1fx %,+.1f = 0}", a, 178, b, c);
        logAction(message + " STARTED");

        if (a == 0) {
            String s = "FIRST PARAMETER IS 0";
            logAction("throws IllegalArgumentException: " + s);
            throw new IllegalArgumentException(s);
        }
        double d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        if (d < 0) {
            return logAction("no roots");
        } else if (d == 0) {
            return logAction(String.valueOf((-b / (2 * a))));
        } else {
            return logAction(String.format("%s %s", x1, x2));
        }
    }

    private static String logAction(String message) {
        FileLogger.startLogger(QuadraticEquation.class.getSimpleName() + " {" + message + '}');
        return message;
    }
}