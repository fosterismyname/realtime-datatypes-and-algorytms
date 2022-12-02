package ru.mirea.eighteenthpart;

public class Ex1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}