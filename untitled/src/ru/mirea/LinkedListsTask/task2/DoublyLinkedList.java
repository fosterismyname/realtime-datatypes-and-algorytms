package ru.mirea.LinkedListsTask.task2;

public class DoublyLinkedList<T> {
    private Node<T> head; /** голова списка */
    private Node<T> tail; /** хвост списка */

    private int length = 0; /** длина списка */

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getNode(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length - 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        int steps;
        if (position >= length / 2) {
            steps = (length - 1) - position;
            Node<T> current = tail;

            while (steps - 1 >= 0) {
                current = current.prev;
                steps--;
            }
            return current;
        }

        Node<T> current = head;
        steps = position;

        while (steps - 1 >= 0) {
            current = current.next;
            steps--;
        }
        return current;
    }

    public T getElem(int position) throws ArrayIndexOutOfBoundsException{
        return getNode(position).data;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        length++;

        if (this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;

        head = newNode;
    }

    public void remove() throws NullPointerException {
        if (this.isEmpty())
            throw new NullPointerException("List is empty!");
        head = head.next;
        head.prev = null;
        length--;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        length++;

        if (this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void pop() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }
        tail = tail.prev;
        tail.next = null;
        length--;
    }


    public void add(int position, T data) throws ArrayIndexOutOfBoundsException {
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }

        if (position == 0) {
            this.push(data);
            return;
        }

        if (position == length) {
            this.add(data);
            return;
        }

        Node<T> newNode = new Node<>();
        newNode.data = data;

        Node<T> current = getNode(position - 1);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current.next.next.prev = newNode;

        length++;
    }

    public void remove(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length - 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        Node<T> current = getNode(position);
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
        length--;
    }

    public void print() {
        Node<T> current = head;

        if (this.isEmpty()) {
            System.out.println("null");
            return;
        }

        System.out.print("null <- ");
        while (current.next != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.print(current.data + " -> ");
        System.out.println("null");
    }
}