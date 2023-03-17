package Homework.Seminar4.gb.list;

import Homework.Seminar4.gb.GBList;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private int size;

    {
        size = 0;
    }

    private Node<T> head;
    private Node<T> tail;

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public GBLinkedList(T head) {
        this();
        addFirst(head);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;

        return getNode(index).data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(T t) {
        Node<T> temp = new Node<>(t);
        if (isEmpty()) tail = temp;
        else head.preview = temp;
        temp.next = head;
        head = temp;
        size++;
    }

    @Override
    public void addLast(T t) {
        Node<T> temp = new Node<>(t);
        if (isEmpty()) head = temp;
        else tail.next = temp;
        temp.preview = tail;
        tail = temp;
        size++;
    }

    @Override
    public void removeFirst() {
        Node<T> nodeToRemove = getNode(0);
        head = nodeToRemove.next;
        nodeToRemove.next.preview = nodeToRemove.preview;
        nodeToRemove.preview = nodeToRemove.next = null;
        size--;
    }

    @Override
    public void removeLast() {
        Node<T> nodeToRemove = getNode(size-1);
        nodeToRemove.preview.next = nodeToRemove.next;
        tail = nodeToRemove.preview;
        nodeToRemove.preview = nodeToRemove.next = null;
        size--;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }

    public Node<T> getNode(int i) {
        Node<T> current = head;

        for (int pos = 0; current != null && pos < i; pos++) {
            current = current.next;
        }

        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T i : this) {
            sb.append(i);
            sb.append(i == tail.data ? "." : ",");
        }
        return sb.toString();
    }
}

