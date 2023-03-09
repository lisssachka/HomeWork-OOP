package Homework.Seminar1;

public class Fish extends Animal {
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
    public void toGo() {}

    @Override
    public void fly() {}
}
