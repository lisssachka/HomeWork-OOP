package Homework.Seminar2.impl;

import Homework.Seminar2.Animals;
import Homework.Seminar2.Swimable;

public class Fish extends Animals implements Swimable {
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Tsss!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void toGo() {}

    @Override
    public int getSwimSpeed() {
        return 35;
    }
}
