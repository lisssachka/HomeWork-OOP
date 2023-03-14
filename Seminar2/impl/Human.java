package Homework.Seminar2.impl;

import Homework.Seminar2.Animals;

public abstract class Human extends Animals {
    public Human(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }

    @Override
    public void hunt() {}

    public abstract void work();

    public void speak(){
        System.out.printf("Hello, my name is %s$n",this.getName());
    }
}
