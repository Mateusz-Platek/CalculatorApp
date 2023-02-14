package org.example;

public class Calculator {
    private static Double a;
    private static Double b;

    public static void setA(Double a) {
        Calculator.a = a;
    }
    public static Double getA() {
        return a;
    }
    public static void setB(Double b) {
        Calculator.b = b;
    }
    public static Double getB() {
        return b;
    }

    public static Double sum() {
        if (a == null || b == null) {
            return checkIfNull();
        }
        return a + b;
    }
    public static Double subtraction() {
        if (a == null || b == null) {
            return checkIfNull();
        }
        return a - b;
    }
    public static Double multiplication() {
        if (a == null || b == null) {
            return checkIfNull();
        }
        return a * b;
    }
    public static Double division() {
        if (a == null || b == null) {
            return checkIfNull();
        }
        return a / b;
    }
    public static Double checkIfNull() {
        if (a == null && b == null) {
            return null;
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        return null;
    }
}
