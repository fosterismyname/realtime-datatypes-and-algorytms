package ru.mirea.seventhpart.task3;

import java.util.Scanner;

public class ProcessStrings implements Stringable {

    private final String currStr;

    public ProcessStrings(String currStr) {
        this.currStr = currStr;
    }

    public void stringCounter() {
        Scanner in = new Scanner(System.in);
        char currChar = in.nextLine().charAt(0);
        int counter = 0;
        for (int i = 0; i < currStr.length(); i++) {
            if (currStr.charAt(i) == currChar) counter = counter + 1;
        }
        System.out.println(counter);
    }

    public void subString() {
        String result = "";
        for (int i = 0; i < currStr.length(); i++) {
            if (i % 2 == 1) result = result + currStr.charAt(i);
        }
        System.out.println(result);
    }

    public void reverseString() {
        String result = "";
        for (int i = currStr.length() - 1; i >= 0; i++) {
            result = result + currStr.charAt(i);
        }
        System.out.println(result);
    }

    @Override
    public String toString() {
        return currStr;
    }
}