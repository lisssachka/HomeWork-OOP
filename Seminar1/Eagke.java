package Homework.Seminar1;

public class Eagke extends Animal {
    public Eagke(String name, String color) {
        super(name, color,4);
    }

    public Eagke(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}

}