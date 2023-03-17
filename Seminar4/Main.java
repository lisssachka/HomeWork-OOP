package Homework.Seminar4;

import Homework.Seminar4.gb.list.GBLinkedList;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> integers = new GBLinkedList<>(1);
        integers.addFirst(9);
        integers.addLast(10);
        integers.addFirst(5);
        integers.addLast(2);
        integers.addLast(3);
        integers.addLast(4);
        integers.addLast(7);
        System.out.println(integers);

        integers.removeFirst();
        System.out.println(integers);

        integers.removeLast();
        System.out.println(integers);

        System.out.println(integers.size());

        System.out.println(integers.get(2));

    }

}
