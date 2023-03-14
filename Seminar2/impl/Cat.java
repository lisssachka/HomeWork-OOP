package Homework.Seminar2.impl;

import Homework.Seminar2.Runnable;
import seminar2.*;

public class Cat extends Animals implements Illable, Runnable {
    public Cat(String name, String color) {
        super(name, color,0);
    }

    public Cat(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void hunt() {}

    @Override
    public void toGo() {

    }

    @Override
    public int getRunSpeed() {
        return 30;
    }

    @Override
    public void getIll() {

    }
}


