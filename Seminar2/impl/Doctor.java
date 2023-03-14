package Homework.Seminar2.impl;

public class Doctor extends Human {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void toGo() {

    }

    @Override
    public void work() {
        System.out.println("Curing animals...");
    }
}
