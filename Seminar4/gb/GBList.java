package Homework.Seminar4.gb;

public interface GBList<T> extends Iterable<T> {
    int size();
    T get(int index);
     boolean isEmpty();
    void addFirst(T t);
    void addLast(T t);
    void removeFirst();
    void removeLast();

}
