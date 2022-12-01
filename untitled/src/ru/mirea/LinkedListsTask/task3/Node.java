package ru.mirea.LinkedListsTask.task3;

public class Node<T> {
    public T data;

    public Node<T> next;

    public Node(T data) {
        next = null;
        this.data = data;
    }

    public void displayNodeData() {
        System.out.print("-> " + data);
    }
}