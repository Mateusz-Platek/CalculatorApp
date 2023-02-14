package org.example;

import java.util.Scanner;

public class Menu {
    private static Integer option;
    private static Double value;
    private static Scanner scanner = new Scanner(System.in);
    public static void showOptions() {
        System.out.println("A: " + Calculator.getA());
        System.out.println("B: " + Calculator.getB());
        System.out.println("1 - Set A");
        System.out.println("2 - Set B");
        System.out.println("3 - Sum");
        System.out.println("4 - Subtraction");
        System.out.println("5 - Multiplication");
        System.out.println("6 - Division");
        System.out.println("7 - Exit");
        System.out.println("Select operation:");
        option = Integer.parseInt(scanner.nextLine());
    }
    public static void sumNumbers() {
        System.out.println("Result: " + Calculator.sum());
        Calculator.setA(Calculator.sum());
        Calculator.setB(null);
    }
    public static void subtractNumbers() {
        System.out.println("Result: " + Calculator.subtraction());
        Calculator.setA(Calculator.subtraction());
        Calculator.setB(null);
    }
    public static void multiplyNumbers() {
        System.out.println("Result: " + Calculator.multiplication());
        Calculator.setA(Calculator.multiplication());
        Calculator.setB(null);
    }
    public static void divideNumbers() {
        System.out.println("Result: " + Calculator.division());
        Calculator.setA(Calculator.division());
        Calculator.setB(null);
    }
    public static void runCalculator() {
        while (true) {
            showOptions();
            switch (option) {
                case 1 -> {
                    System.out.println("Input number:");
                    Calculator.setA(Double.parseDouble(scanner.nextLine()));
                }
                case 2 -> {
                    System.out.println("Input number:");
                    Calculator.setB(Double.parseDouble(scanner.nextLine()));
                }
                case 3 -> sumNumbers();
                case 4 -> subtractNumbers();
                case 5 -> multiplyNumbers();
                case 6 -> divideNumbers();
                case 7 -> {
                    System.out.println("End of the calculator");
                    System.exit(0);
                }
                default -> System.out.println("Wrong number");
            }
        }
    }
}
