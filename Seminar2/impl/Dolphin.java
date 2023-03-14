package Homework.Seminar2.impl;

import Homework.Seminar2.Animals;
import Homework.Seminar2.Swimable;

public class Dolphin extends Animals implements Swimable {
    public Dolphin(String name, String color) {
        super(name, color,0);
    }

    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Skree!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void toGo() {}

    @Override
    public int getSwimSpeed() {
        return 50;
    }
}
