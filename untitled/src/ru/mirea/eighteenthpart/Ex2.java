package ru.mirea.eighteenthpart;

import java.util.Scanner;

public class Ex2 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}