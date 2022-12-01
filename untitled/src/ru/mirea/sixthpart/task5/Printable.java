package ru.mirea.sixthpart.task5;

public interface Printable {
    void print();

    public static void printMagazines(Printable[] printables) {
        for (Printable elem : printables) {
            if (elem instanceof Book) System.out.print(elem + " ");
        }
    }

    public static void printBooks(Printable[] printables) {
        for (Printable elem : printables) {
            if (elem instanceof Magazine) System.out.print(elem + " ");
        }
    }

}