package ru.mirea.LinkedListsTask.task1;

public class SingleLinkedList<T> {
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    private int length = 0;

    public Iterator<T> iterator() {
        return new SingleLinkedIterator<>(this);
    }

    public SingleLinkedList() {
        head = null;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getNode(int position) throws ArrayIndexOutOfBoundsException{
        if (position > length | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        Node<T> current = head;
        while (position - 1 >= 0) {
            current = current.next;
            position--;
        }
        return current;
    }

    public T get(int position) throws ArrayIndexOutOfBoundsException {
        return getNode(position).data;
    }

    public void replace(int position, T newData) throws ArrayIndexOutOfBoundsException{
        Node<T> current = getNode(position);
        current.data = newData;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void remove() throws NullPointerException{
        if (this.isEmpty())
            throw new NullPointerException("List is empty!");
        head = head.next;
        length--;
    }

    public void add(T data) {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node<T> newNode = new Node<>();
        newNode.data = data;
        current.next = newNode;
        length++;
    }

    public void pop() throws NullPointerException{
        if(this.isEmpty())
            throw new NullPointerException("List is empty!");
        Node<T> current = head;
        Node<T> temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
        length--;
    }

    public void add(int position, T data) throws ArrayIndexOutOfBoundsException{
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        if (position == 0) {
            this.push(data);
            return;
        }
        Node<T> current = head;
        while (position - 1 > 0) {
            current = current.next;
            position--;
        }
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }


    public void remove(int position) throws ArrayIndexOutOfBoundsException{
        if(position>length-1|position<0)
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        Node<T> current = head;
        while (position - 1 > 0) {
            current = current.next;
            position--;
        }
        current.next = current.next.next;
        length--;
    }

    public static <T> void clear(SingleLinkedList<T> list) {
        while (list.head != null) {
            Node<T> next = list.head.next;
            list.head.data = null;
            list.head.next = null;
            list.head = next;
        }
        list.length = 0;
    }


    public static <T extends Number & Comparable<T>> void recursiveSort(SingleLinkedList<T> list) {
        if (list.length <= 1) return;

        SingleLinkedList<T> a = new SingleLinkedList<>();
        int a_length = list.length / 2;

        SingleLinkedList<T> b = new SingleLinkedList<>();
        int b_length = list.length - a_length;

        for (int i = 0; i < list.length; i++) {
            if (i < a_length)
                a.add(i, list.get(i));
            else
                b.add(i - a_length, list.get(i));
        }

        recursiveSort(a);
        recursiveSort(b);

        int ai = 0, bi = 0;
        while (ai + bi < list.length) {
            if (bi >= b_length || (ai < a_length && (a.get(ai).compareTo(b.get(bi))) < 0)) {
                list.replace(ai + bi, a.get(ai));
                ai++;
            } else {
                list.replace(ai + bi, b.get(bi));
                bi++;
            }
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println("NULL");
    }
}
