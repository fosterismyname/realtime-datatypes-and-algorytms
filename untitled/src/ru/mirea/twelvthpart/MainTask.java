package ru.mirea.twelvthpart;

public class MainTask {
    private static String line;

    public static void getString(String inputString) {
        line = inputString;
    }

    public static void main(String[] args) {
        getString("test test?!");

        System.out.println("Последний символ: " + line.charAt(line.length() - 1));
        System.out.println("Оканчивается ли строка на ?!: " + line.endsWith("?!"));
        System.out.println("Начинается ли строка на t: " + line.startsWith("t"));
        System.out.println("Содержит ли строка подстроку test: " + line.contains("test"));
        System.out.println("Позиция подстроки test: " + line.indexOf("test"));
        System.out.println("Замена буквы e на букву i: " + line.replace('e', 'i'));
        System.out.println("Строка в верхнем регистре: " + line.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + line.toLowerCase());
        System.out.println("Вырез подстроки test: " + line.substring(line.indexOf("test"), line.indexOf("test") + "test".length()));
    }
}