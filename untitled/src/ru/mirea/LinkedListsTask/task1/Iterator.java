package ru.mirea.LinkedListsTask.task1;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException();
    }
}