package Homework.Seminar2.veterinary;

import Homework.Seminar2.*;
import Homework.Seminar2.Runnable;
import Homework.Seminar2.impl.*;

import java.util.*;

public class VetClinic {
    private final List<Animals> animals;
    private Human human;

    public VetClinic(Human human){
        this.human = human;
        this.animals = new ArrayList<>();
    }

    public VetClinic(){this(null);}
    public VetClinic addAnimal(Animals animal) {
        if (animal instanceof Human)
            this.human = (Human) animal;
        else
            this.animals.add(animal);
        return this;
    }

    public List<Animals> getAllAnimals() { return this.animals; }
    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animals a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Illable> getIllingAnimals() {
        List<Illable> IllingAnimals = new ArrayList<>();

        for (Animals a: this.animals)
            if (a instanceof Illable) IllingAnimals.add((Illable) a);

        return IllingAnimals;
    }
    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animals a: this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();

        for (Animals a: this.animals)
            if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

        return swimmingAnimals;
    }


    public Human getHuman() {
        return human;
    }


}
