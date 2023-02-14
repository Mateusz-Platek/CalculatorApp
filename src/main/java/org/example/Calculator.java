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
        return a + b;
    }
    public static Double subtraction() {
        return a - b;
    }
    public static Double multiplication() {
        return a * b;
    }
    public static Double division() {
        return a / b;
    }
}
