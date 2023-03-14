package Homework.Seminar2;
import Homework.Seminar2.veterinary.*;
import Homework.Seminar2.impl.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Кеша"))
                .addAnimal(new Dog("Тузик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Eagle("Орёль"))
                .addAnimal(new Fish("Себастьян"))
                .addAnimal(new Dolphin("Флиппер"))
                .addAnimal(new Doctor("Айболит"));

        System.out.println("All animals:");
        for (Animals a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimSpeed());
        }

        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlySpeed());
        }

        System.out.println("\nIlling animals:");
        for (Illable sp: vetClinic.getIllingAnimals()) {
            System.out.println(sp);
            sp.getIll();
        }

        System.out.println("\nDoctor of this clinic:");
        System.out.println(vetClinic.getHuman());
        vetClinic.getHuman().speak();
        vetClinic.getHuman().work();
    }
}
