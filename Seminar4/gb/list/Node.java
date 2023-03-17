package Homework.Seminar4.gb.list;

public class Node<T> {
    public T data;
    public Node<T>  preview;
    public Node<T> next;

    public Node(T data, Node<T> preview, Node<T> next) {
        this.data = data;
        this.preview = preview;
        this.next = next;
    }
    public Node(T data) { this(data, null, null); }

    @Override
    public String toString() {
        return data.toString();
    }
}
