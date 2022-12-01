package ru.mirea.LinkedListsTask.task3;

public class CircularLinkedList<T> {
    public Node<T> head; /** голова списка */
    public Node<T> tail; /** хвост списка */

    private int length = 0; /** длина списка */

    public CircularLinkedList() {
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
        Node<T> current = head;

        while (position - 1 >= 0) {
            current = current.next;
            position--;
        }
        return current;
    }

    public T getElem(int position) throws ArrayIndexOutOfBoundsException {
        return getNode(position).data;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        length++;

        if(this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void remove() throws NullPointerException {
        if(this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }
        head = head.next;
        tail.next = head;
        length--;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        length++;

        if(this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void pop() throws NullPointerException {
        if(this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }

        tail = getNode(length-2);
        tail.next = head;
        length--;
    }

    public void add(int position, T data) throws ArrayIndexOutOfBoundsException {
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Index input exceeds array bounds!");
        }

        if(position ==0) {
            this.push(data);
            return;
        }
        if(position==length) {
            this.add(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = getNode(position - 1);
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }

    public void remove(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length -1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }

        if(position ==0) {
            this.remove();
            return;
        }
        if(position==length-1) {
            this.pop();
            return;
        }

        Node<T> prevNode = getNode(position-1);
        prevNode.next = getNode(position+1);

        length--;
    }

    public void print() {
        Node<T> current = head;

        if (this.isEmpty()) {
            System.out.println("null");
            return;
        }

        System.out.print("-");
        for(int i = length; i > 0; i--) {
            current.displayNodeData();
            current = current.next;
            System.out.print(" ");
        }
        System.out.println(" --");
    }
}