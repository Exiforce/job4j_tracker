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
        System.out.println(result1);
        int result2 = minus(12);
        System.out.println(result2);
        Calculator calculator1 = new Calculator();
        int result3 = calculator1.multiply(5);
        System.out.println(result3);
        Calculator calculator2 = new Calculator();
        int result4 = calculator2.devide(20);
        System.out.println(result4);
        Calculator calculator3 = new Calculator();
        int result5 = calculator3.sumAllOperation(4);
        System.out.println(result5);
    }
}