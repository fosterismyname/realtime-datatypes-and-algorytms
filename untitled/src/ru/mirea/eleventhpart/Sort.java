package ru.mirea.eleventhpart;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sort {
    public static void main(String[] args) {

        long start = System.nanoTime();

        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);
    }
}