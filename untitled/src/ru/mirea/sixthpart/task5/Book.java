package ru.mirea.sixthpart.task5;

public class Book implements Printable {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[author = " + author + ", title = " + title + "]";
    }

    @Override
    public void print() {
        System.out.println("author = " + author + ", title = " + title);
    }

}