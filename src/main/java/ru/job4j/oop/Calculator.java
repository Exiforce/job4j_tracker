package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + devide(c);
    }

    public int devide(int b) {
        return b / x;
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        int result2 = minus(12);
        Calculator calculator = new Calculator();
        int result3 = calculator.multiply(5);
        int result4 = calculator.devide(20);
        int result5 = calculator.sumAllOperation(4);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }
}
