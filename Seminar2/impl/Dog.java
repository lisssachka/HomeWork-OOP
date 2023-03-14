package Homework.Seminar2.impl;

import Homework.Seminar2.Runnable;
import seminar2.*;

public class Dog extends Animals implements Illable, Runnable {

    public Dog(String name, String color) {
        super(name, color,0);
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Woof");;
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public void toGo() {
        System.out.println("Go!");
    }

    @Override
    public void getIll() {

    }
    @Override
    public int getRunSpeed() {
        return 40;
    }
}