package Homework.Seminar2.impl;

import Homework.Seminar2.*;

public class Duck extends Animals implements Flyable, Illable {
    
    public Duck(String name, String color) {
        super(name, color,0);
    }

    public Duck(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");;
    }

    public void fly(){
        System.out.println("Полетели!");
    }

    public void hunt(){
        wakeUp();
        findFood();
        eat();
    }

    public void toGo(){
        System.out.println("Go!");
    }

    @Override
    public int getFlySpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}