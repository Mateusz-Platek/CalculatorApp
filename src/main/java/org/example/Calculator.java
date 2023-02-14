package org.example;

public class Calculator {
    private Double a;
    private Double b;
    Calculator() {
        this.a = null;
        this.b = null;
    }
    public void setA(Double a) {
        this.a = a;
    }
    public Double getA() {
        return a;
    }
    public void setB(Double b) {
        this.b = b;
    }
    public Double getB() {
        return b;
    }
    Double sum() {
        return a + b;
    }
    Double subtraction() {
        return a - b;
    }
    Double multiplication() {
        return a * b;
    }
    Double division() {
        return a / b;
    }

}
