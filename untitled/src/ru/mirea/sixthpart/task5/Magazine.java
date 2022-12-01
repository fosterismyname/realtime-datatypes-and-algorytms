package ru.mirea.sixthpart.task5;

public class Magazine implements Printable {

    private final String author;
    private final String title;

    public Magazine(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine[author = " + author + ", title = " + title + "]";
    }

    @Override
    public void print() {
        System.out.println("author = " + author + ", title = " + title);
    }

}