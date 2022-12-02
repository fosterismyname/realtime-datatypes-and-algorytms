package ru.mirea.eighteenthpart;

public class Tester {
    public static void main(String[] args) {
        try {
            System.err.print("0");
            throw new RuntimeException();
        } catch (Exception e) {
            System.err.print("2");
        }
        System.err.println("3");
    }
}